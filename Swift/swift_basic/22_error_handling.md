## # Error Handling

스위프트에서 **오류(Error)** 는 Error라는 프로토콜을 준수하는 타입의 값을 통해 표현됩니다. Error 프로토콜은 사실상 요구사항이 없는 빈 프로토콜일 뿐이지만, 오류를 표현하기 위한 타입(주로 열거형)은 이 프로토콜을 채택합니다.

> 스위프트의 열거형은 오류의 종류를 나타내기에 아주 적합한 기능입니다. 연관 값을 통해 오류에 관한 부가 정보를 제공할 수도 있습니다.

```swift
enum 오류종류이름: Error {
    case 종류1
    case 종류2
    case 종류3
    //...
}
```

> 자판기 동작 오류의 종류를 표현한 VendingMachineError 열거형

```swift
enum VendingMachineError: Error {
    case invalidInput
    case insufficientFunds(moneyNeeded: Int)
    case outOfStock
}
```

## 함수에서 발생한 오류 던지기 throws

> 자판기 동작 도중 발생한 오류를 던지는 메서드를 구현해봅니다. 오류 발생의 여지가 있는 메서드는 throws를 사용하여 오류를 내포하는 함수임을 표시합니다.

```swift
class VendingMachine {
    let itemPrice: Int = 100
    var itemCount: Int = 5
    var deposited: Int = 0

    // 돈 받기 메서드
    func receiveMoney(_ money: Int) throws {

        // 입력한 돈이 0이하면 오류를 던집니다
        guard money > 0 else {
            throw VendingMachineError.invalidInput
        }

        // 오류가 없으면 정상처리를 합니다
        self.deposited += money
        print("\(money)원 받음")
    }

    // 물건 팔기 메서드
    func vend(numberOfItems numberOfItemsToVend: Int) throws -> String {

        // 원하는 아이템의 수량이 잘못 입력되었으면 오류를 던집니다
        guard numberOfItemsToVend > 0 else {
            throw VendingMachineError.invalidInput
        }

        // 구매하려는 수량보다 미리 넣어둔 돈이 적으면 오류를 던집니다
        guard numberOfItemsToVend * itemPrice <= deposited else {
            let moneyNeeded: Int
            moneyNeeded = numberOfItemsToVend * itemPrice - deposited

            throw VendingMachineError.insufficientFunds(moneyNeeded: moneyNeeded)
        }

        // 구매하려는 수량보다 요구하는 수량이 많으면 오류를 던집니다
        guard itemCount >= numberOfItemsToVend else {
            throw VendingMachineError.outOfStock
        }

        // 오류가 없으면 정상처리를 합니다
        let totalPrice = numberOfItemsToVend * itemPrice

        self.deposited -= totalPrice
        self.itemCount -= numberOfItemsToVend

        return "\(numberOfItemsToVend)개 제공함"
    }
}

// 자판기 인스턴스
let machine: VendingMachine = VendingMachine()

// 판매 결과를 전달받을 변수
var result: String?
```

## 오류 처리하기

> 던져진 코드를 처리하기 위한 코드를 작성해야 합니다.  
> `do-catch`문은 오류가 발생하면 코드를 실행하지 않고, 오류가 발생하지 않으면 코드를 실행합니다.

- **`do-catch`**

  ```swift
  do {
  try machine.receiveMoney(0)
  } catch VendingMachineError.invalidInput {
  print("입력이 잘못되었습니다")
  } catch VendingMachineError.insufficientFunds(let moneyNeeded) {
  print("\(moneyNeeded)원이 부족합니다")
  } catch VendingMachineError.outOfStock {
  print("수량이 부족합니다")
  } // 입력이 잘못되었습니다
  ```

  하나의 블럭안에서 switch 구문을 이용하여 오류를 분류할 수도 있습니다.

  ```swift
  do {
  try machine.receiveMoney(300)
  } catch /*(let error)*/ {

  switch error {
  case VendingMachineError.invalidInput:
      print("입력이 잘못되었습니다")
  case VendingMachineError.insufficientFunds(let moneyNeeded):
      print("\(moneyNeeded)원이 부족합니다")
  case VendingMachineError.outOfStock:
      print("수량이 부족합니다")
  default:
      print("알수없는 오류 \(error)")
  }
  } // 300원 받음
  ```

  딱히 케이스별로 오류처리 할 필요가 없으면 catch 구문 내부를 간략화해도 무방합니다.

  ```swift
  do {
  result = try machine.vend(numberOfItems: 4)
  } catch {
  print(error)
  } // insufficientFunds(100)
  ```

- **`try? 와 try!`**

  `try?`

  > 별도의 오류처리 결과를 통보받지 않고 오류가 발생했으면 결과값을 nil로 돌려받을 수 있습니다.  
  > 정상동작할 경우에는 옵셔널 타입으로 정상 반환값을 돌려 받습니다.

  ```swift
  result = try? machine.vend(numberOfItems: 2)
  print(result) // Optional("2개 제공함")

  result = try? machine.vend(numberOfItems: 0)
  print(result) // nil
  ```

  `try!`

  > 오류가 발생하지 않을 것이라는 강력한 확신을 가질 때 try!를 사용하면 정상동작 후에 바로 결과값을 돌려받습니다. 오류가 발생하면 런타임 오류가 발생하여 애플리케이션 동작이 중지됩니다.

  ```swift
  result = try! machine.vend(numberOfItems: 1)
  result // 1개 제공함

  result = try! machine.vend(numberOfItems: 1)
  // 런타임 오류 발생!
  ```
