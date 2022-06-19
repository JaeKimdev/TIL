## # Optional - 값이 있을 수도 있고 없을 수도 있음

> Implicitly Unwrapped Optional - 암시적 추출 옵셔널(`!`사용)

```Swift
var implicitlyUnwrappedOptionalValue: Int! = 100

switch implicitlyUnwrappedOptionalValue {
case .none:
    print("This Optional variable is nil")
case .some(let value):
    print("Value is \(value)")
}

// 기존 변수처럼 사용 가능
implicitlyUnwrappedOptionalValue = implicitlyUnwrappedOptionalValue + 1

// nil 할당 가능
implicitlyUnwrappedOptionalValue = nil

// 잘못된 접근으로 인한 런타임 오류 발생
//implicitlyUnwrappedOptionalValue = implicitlyUnwrappedOptionalValue + 1
```

> Optional - 옵셔널(`?`사용)

```Swift
var optionalValue: Int? = 100

switch optionalValue {
case .none:
    print("This Optional variable is nil")
case .some(let value):
    print("Value is \(value)")
}

// nil 할당 가능
optionalValue = nil

// 기존 변수처럼 사용불가 - 옵셔널과 일반 값은 다른 타입이므로 연산불가
//optionalValue = optionalValue + 1
```

## # Optional Unwapping - 옵셔널의 값을 꺼내오는 방법

> Optional Binding - 옵셔널 바인딩(nil체크 + 안전한 값 추출)

```Swift
func printName(_ name: String) {
    print(name)
}

var myName: String? = nil

printName(myName) // 전달되는 값의 타입이 다르기 때문에 컴파일 오류발생

// # If-let 방식으로 바인딩
func printName(_ name: String) {
    print(name)
}

var myName: String! = nil

if let name: String = myName {
    printName(name)
} else {
    print("myName == nil")
}

// name 상수는 if-let 구문 내에서만 사용가능합니다
printName(name) // 상수 사용범위를 벗어났기 때문에 컴파일 오류 발생


// ,를 사용해 한 번에 여러 옵셔널을 바인딩 할 수 있습니다
// 모든 옵셔널에 값이 있을 때만 동작합니다 - 이 예제에서는 myName과 yourName
var myName = "jae"
var yourName = nil

if let name = myName, let friend = yourName {
    print("\(name) and \(friend)") // yourName이 nil이기 때문에 실행되지 않습니다
}

yourName = "hana"

if let name = myName, let friend = yourName {
    print("\(name) and \(friend)")
}
// jae and hana

```

> Force Unwrapping - 강제 추출(그다지 추천되는 방식은 아님-보통 바인딩을 사용)

```Swift
func printName(_ name: String) {
    print(name)
}

var myName: String? = "jae"

printName(myName!) // jae

myName = nil

print(myName!) // 강제추출시 값이 없으므로 런타임 오류 발생

var yourName: String! = nil

printName(yourName) // nil 값이 전달되기 때문에 런타임 오류발생
```
