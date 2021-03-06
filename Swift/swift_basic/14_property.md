## # Property 프로퍼티

타입 내부에 정의된 상수나 변수를 프로퍼티라고 힙니다.

- 저장 프로퍼티
- 연산 프로퍼티

프로퍼티는 구조체, 클래스, 열거형 내부에 구현할 수 있습니다. 다만 열거형 내부에는 연산 프로퍼티만 구현할 수 있습니다. 연산 프로퍼티는 `var`로만 선언할 수 있습니다.

```swift
struct Student {

    // 인스턴스 저장 프로퍼티
    var name: String = ""
    var `class`: String = "Swift"
    var koreanAge: Int = 0

    // 인스턴스 연산 프로퍼티
    var westernAge: Int {
        get {
            return koreanAge - 1
        }

        set(inputValue) {
            koreanAge = inputValue + 1
        }
    }

    // 타입 저장 프로퍼티
    static var typeDescription: String = "학생"

    /*
    // 인스턴스 메서드
    func selfIntroduce() {
        print("저는 \(self.class)반 \(name)입니다")
    }
     */

    // 읽기전용 인스턴스 연산 프로퍼티
    // 간단히 위의 selfIntroduce() 메서드를 대체할 수 있습니다
    var selfIntroduction: String {
        get {
            return "저는 \(self.class)반 \(name)입니다"
        }
    }

    /*
     // 타입 메서드
     static func selfIntroduce() {
     print("학생타입입니다")
     }
     */

    // 읽기전용 타입 연산 프로퍼티
    // 읽기전용에서는 get을 생략할 수 있습니다
    static var selfIntroduction: String {
        return "학생타입입니다"
    }
}

// 타입 연산 프로퍼티 사용
print(Student.selfIntroduction)
// 학생타입입니다

// 인스턴스 생성
var yagom: Student = Student()
yagom.koreanAge = 10

// 인스턴스 저장 프로퍼티 사용
yagom.name = "yagom"
print(yagom.name)
// yagom

// 인스턴스 연산 프로퍼티 사용
print(yagom.selfIntroduction)
// 저는 Swift반 yagom입니다

print("제 한국나이는 \(yagom.koreanAge)살이고, 미쿡나이는 \(yagom.westernAge)살입니다.")
// 제 한국나이는 10살이고, 미쿡나이는 9살입니다.
```

> 응용

```swift
struct Money {
    var currencyRate: Double = 1100
    var dollar: Double = 0
    var won: Double {
        get {
            return dollar * currencyRate
        }
        set {
            dollar = newValue / currencyRate
        }
    }
}

var moneyInMyPocket = Money()

moneyInMyPocket.won = 11000

print(moneyInMyPocket.won)
// 11000.0

moneyInMyPocket.dollar = 10

print(moneyInMyPocket.won)
// 11000.0
```

> 저장 프로퍼티와 연산 프로퍼티의 기능은 지역 / 전역 변수에도 모두 사용 가능합니다.about-language

```swift
var a: Int = 100
var b: Int = 200
var sum: Int {
    return a + b
}

print(sum) // 300
```

## # 프로퍼티 감시자

프로퍼티 감시자를 사용하면 프로퍼티 값이 변경될 때 원하는 동작을 수행할 수 있습니다. 값이 변경되기 직전에 `willSet`블럭이, 값이 변경된 직후에 `didSet`블럭이 호출됩니다. 둘 중 필요한 하나만 구현해 주어도 무관합니다. 변경되려는 값이 기존 값과 똑같더라도 프로퍼티 감시자는 항상 동작합니다. willSet 블럭에서 암시적 매개변수 `newValue`를 사용할 수 있고, didSet 블럭에서 암시적 매개변수 `oldValue`를 사용할 수 있습니다.

‼️ 프로퍼티 감시자는 연산 프로퍼티에 사용할 수 없습니다.

```swift
struct Money {
    // 프로퍼티 감시자 사용
    var currencyRate: Double = 1100 {
        willSet(newRate) {
            print("환율이 \(currencyRate)에서 \(newRate)으로 변경될 예정입니다")
        }

        didSet(oldRate) {
            print("환율이 \(oldRate)에서 \(currencyRate)으로 변경되었습니다")
        }
    }

    // 프로퍼티 감시자 사용
    var dollar: Double = 0 {
        // willSet의 암시적 매개변수 이름 newValue
        willSet {
            print("\(dollar)달러에서 \(newValue)달러로 변경될 예정입니다")
        }

        // didSet의 암시적 매개변수 이름 oldValue
        didSet {
            print("\(oldValue)달러에서 \(dollar)달러로 변경되었습니다")
        }
    }

    // 연산 프로퍼티
    var won: Double {
        get {
            return dollar * currencyRate
        }
        set {
            dollar = newValue / currencyRate
        }

        /* 프로퍼티 감시자와 연산 프로퍼티 기능을 동시에 사용할 수 없습니다
        willSet {

        }
         */
    }
}

var moneyInMyPocket: Money = Money()

// 환율이 1100.0에서 1150.0으로 변경될 예정입니다
moneyInMyPocket.currencyRate = 1150
// 환율이 1100.0에서 1150.0으로 변경되었습니다

// 0.0달러에서 10.0달러로 변경될 예정입니다
moneyInMyPocket.dollar = 10
// 0.0달러에서 10.0달러로 변경되었습니다

print(moneyInMyPocket.won)
// 11500.0
```

> 프로퍼티 감시자의 기능은 지역 / 전역 변수에도 모두 사용 가능합니다

```swift
var c: Int = 100 {
    willSet {
        print("\(c)에서 \(newValue)로 변경될 예정입니다")
    }

    didSet {
        print("\(oldValue)에서 \(c)로 변경되었습니다")
    }
}

// 100에서 200로 변경될 예정입니다
c = 200
// 100에서 200로 변경되었습니다
```

## # Lazy Stored Property 지연 저장 프로퍼티

```swift
struct Yagom {
    var name: String = "야곰"
    var age: Int = 20
    var nickName: String = "천재 " + self.name // error: Cannot find 'self' in scope
}
```

> 의존적인 값을 할당할 수 있다. - 자신의 프로퍼티를 또 다른 프로퍼티에서 사용 가능  
> `lazy var`로만 선언 가능 / 이스턴스 초기화가 완료 될 때까지 값이 없을 수도 있기 때문에 `lazy let` 사용불가

```swift
struct Yagom {
    var name: String = "야곰"
    var age: Int = 20
    lazy var nickName: String = "천재 " + self.name
}

var yagom = Yagom()
yagom.name = "야한곰"

print(yagom.nickName) // 천재 야한곰
```
