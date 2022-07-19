## # Extension

익스텐션(Extension) 은 스위프트의 강력한 기능 중 하나입니다. 익스텐션은 구조체, 클래스, 열거형, 프로토콜 타입에 새로운 **기능을 추가**할 수 있는 기능입니다.

기능을 추가하려는 타입의 구현된 소스 코드를 알지 못하거나 볼 수 없다 해도, 타입만 알고 있다면 그 타입의 기능을 확장할 수도 있습니다.

> 스위프트의 익스텐션이 타입에 추가할 수 있는 기능

- 연산 타입 프로퍼티 / 연산 인스턴스 프로퍼티
- 타입 메서드 / 인스턴스 메서드
- 이니셜라이저
- 서브스크립트
- 중첩 타입
- 특정 프로토콜을 준수할 수 있도록 기능 추가

익스텐션은 타입에 새로운 기능을 추가할 수는 있지만, 기존에 존재하는 기능을 재정의할 수는 없습니다.

> 정의 문법

```swift
extension 확장할 타입 이름 {
    /* 타입에 추가될 새로운 기능 구현 */
}

// 예시
struct Desk {
    let model: String
    let height: Float
    let width: Float
}

extension Desk {
    var isNew: Bool {
        return true
    }
}
```

익스텐션은 기존에 존재하는 타입이 추가적으로 다른 프로토콜을 채택할 수 있도록 확장할 수도 있습니다. 이런 경우에는 클래스나 구조체에서 사용하던 것과 똑같은 방법으로 프로토콜 이름을 나열해줍니다.

```swift
extension 확장할 타입 이름: 프로토콜1, 프로토콜2, 프로토콜3... {
    /* 프로토콜 요구사항 구현 */
}
```

```swift
extension Int {  // 연산 프로퍼티 추가
    var isEven: Bool {
        return self % 2 == 0
    }
    var isOdd: Bool {
        return self % 2 == 1
    }
}

print(1.isEven) // false
print(2.isEven) // true
print(1.isOdd)  // true
print(2.isOdd)  // false

var number: Int = 3
print(number.isEven) // false
print(number.isOdd) // true

number = 2
print(number.isEven) // true
print(number.isOdd) // false
```

위 코드의 익스텐션은 Int 타입에 두 개의 연산 프로퍼티를 추가한 것입니다. Int 타입의 인스턴스가 홀수인지 짝수인지 판별하여 Bool 타입으로 알려주는 연산 프로퍼티입니다. 익스텐션으로 Int 타입에 추가해준 연산 프로퍼티는 Int 타입의 어떤 인스턴스에도 사용이 가능합니다. 위의 코드처럼 인스턴스 연산 프로퍼티를 추가할 수도 있으며, static 키워드를 사용하여 타입 연산 프로퍼티도 추가할 수 있습니다.

```swift
extension Int { // 메서드 추가
    func multiply(by n: Int) -> Int {
        return self * n
    }
}
print(3.multiply(by: 2))  // 6
print(4.multiply(by: 5))  // 20

number = 3
print(number.multiply(by: 2))   // 6
print(number.multiply(by: 3))   // 9
```

```Swift
extension String { // 이니셜라이저 추가
    init(int: Int) {
        self = "\(int)"
    }

    init(double: Double) {
        self = "\(double)"
    }
}

let stringFromInt: String = String(int: 100)
// "100"

let stringFromDouble: String = String(double: 100.0)
// "100.0"
```

## # 프로토콜과 extension

extension은 프로토콜과 함께 사용될 때 또 강력한 힘을 발휘할 수 있습니다. extension을 이용해서 프로토콜의 기본값을 설정해줄 수 있기 때문이지요. extension을 이용하면 프로토콜의 껍데기에 기능을 구현해둘 수 있습니다!

```swift
protocol hasDiseases {
    var diseases: [String] { get set }

    func groan()
}

extension hasDiseases {
    func groan() {
        print("아이고.. 나 죽네..")
    }
}

struct PatientA: hasDiseases {
    var diseases: [String] = ["감기", "당뇨"]
}

struct PatientB: hasDiseases {
    var diseases: [String] = ["비염", "축농증"]

    func groan() {
        print("콧물 멈춰!! ㅜ")
    }
}

let patientA = PatientA()
let patientB = PatientB()

patientA.groan() // 아이고.. 나 죽네..
patientB.groan() // 콧물 멈춰!! ㅜ
```

## Reference

[Swift Docs - Extensions](https://docs.swift.org/swift-book/LanguageGuide/Extensions.html)
