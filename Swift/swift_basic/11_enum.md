## # Enumeration 열거형

> 정의 문법

- enum은 타입이므로 `대문자 카멜케이스`를 사용하여 이름을 정의합니다
- 각 case는 `소문자 카멜케이스`로 정의합니다
- 각 case는 그 자체가 고유의 값입니다
- 각 케이스는 한 줄에 개별로도, 한 줄에 여러개도 정의할 수 있습니다

```Swift
enum 이름 {
	case 이름1
	case 이름2
	case 이름3, 이름4, 이름5
	// ...
}
```

> 열거형 사용

```Swift
enum Weekday {
    case mon
    case tue
    case wed
    case thu, fri, sat, sun
}

// 열거형 타입과 케이스를 모두 사용하여도 됩니다
var day: Weekday = Weekday.mon //최초 선언할 때에는 Type을 명시해주어야 합니다.
day = .tue // 타입이 명확하다면 .케이스 처럼 표현해도 무방합니다

print(day) // tue

// switch의 비교값에 열거형 타입이 위치할 때
// 모든 열거형 케이스를 포함한다면 default를 작성할 필요가 없습니다
switch day {
case .mon, .tue, .wed, .thu:
    print("평일입니다")
case Weekday.fri:
    print("불금 파티!!")
case .sat, .sun:
    print("신나는 주말!!")
}
// 평일입니다
```

## # rawValue 원시값

C 언어의 enum처럼 정수값을 가질 수도 있습니다. `rawValue`를 사용하면 됩니다. case별로 각각 다른 값을 가져야합니다

```Swift
enum Fruit: Int {
    case apple = 0
    case grape = 1
    case peach
    // case mango = 0
    // mango와 apple의 원시값이 같으므로 mango 케이스의 원시값을 0으로 정의할 수 없습니다
}

print("Fruit.peach.rawValue == \(Fruit.peach.rawValue)") // Fruit.peach.rawValue == 2
```

> 정수 타입 뿐만 아니라 Hashable 프로토콜을 따르는 모든 타입이 원시값의 타입으로 지정될 수 있습니다.

```Swift
enum School: String {
    case elementary = "초등"
    case middle = "중등"
    case high = "고등"
    case university
}

print("School.middle.rawValue == \(School.middle.rawValue)")
// School.middle.rawValue == 중등

// 열거형의 원시값 타입이 String일 때, 원시값이 지정되지 않았다면
// case의 이름을 원시값으로 사용합니다
print("School.university.rawValue == \(School.university.rawValue)")
// School.middle.rawValue == university
```

> 원시값을 통한 초기화

- rawValue를 통해 초기화 할 수 있습니다.
- rawValue가 case에 해당하지 않을 수 있으므로 rawValue를 통해 초기화 한 인스턴스는 옵셔널 타입입니다.

```Swift
// rawValue를 통해 초기화 한 열거형 값은 옵셔널 타입이므로 Fruit 타입이 아닙니다
//let apple: Fruit = Fruit(rawValue: 0)
let apple: Fruit? = Fruit(rawValue: 0)

// if let 구문을 사용하면 rawValue에 해당하는 케이스를 곧바로 사용할 수 있습니다
if let orange: Fruit = Fruit(rawValue: 5) {
    print("rawValue 5에 해당하는 케이스는 \(orange)입니다")
} else {
    print("rawValue 5에 해당하는 케이스가 없습니다")
} // rawValue 5에 해당하는 케이스가 없습니다
```

> 메써드

스위프트의 열거형에는 메서드도 추가할 수 있습니다.

```Swift
enum Month {
    case dec, jan, feb
    case mar, apr, may
    case jun, jul, aug
    case sep, oct, nov

    func printMessage() {
        switch self {
        case .mar, .apr, .may:
            print("따스한 봄~")
        case .jun, .jul, .aug:
            print("여름 더워요~")
        case .sep, .oct, .nov:
            print("가을은 독서의 계절!")
        case .dec, .jan, .feb:
            print("추운 겨울입니다")
        }
    }
}

Month.mar.printMessage() // 따스한 봄~
```

> Associated Values 연관 값

Enum case를 더 자세히 설명해 주는 추가 정보를 저장할 수 있는 기능.

```Swift
enum Activity {
    case swimming
    case running
    case talking
    case singing
}

// 어디로 달려가는지, 어떤 이야기를 하는지.. 등의 정보를 Enum에 추가할 수 있다.

enum Activity {
    case swimming
    case running(destination: String)
    case talking(topic: String)
    case singing(volume: Int)
}

let talking = Activity.talking(topic: "football")

// 또 다른 예제

enum Weather {
    case sunny
    case windy(speed: Int)
    case rainy(chance: Int, amount: Int)
}
```

```Swift
enum MainDish {
    case pasta(taste: String)
    case pizza(dough: String, topping: String)
    case chicken(sauce: Bool)
    case rice
}

var dinner: MainDish = MainDish.chicken(sauce: false)
dinner = .pasta(taste: "크림")
dinner = .pizza(dough: "씬", topping: "새우")
dinner = MainDish.rice

// 또는 열거형 안에 열거형을 넣어서 메뉴를 선택하게 할 수도 있다.

enum PastaTaste {
    case cream, tomato
}

enum PizzaDough {
    case cheeseCrust, thin, original
}

enum PizzaTopping {
    case pepperoni, cheese, bacon
}

enum MainDish {
    case pasta(pasta: PastaTaste)
    case pizza(dough: PizzaDough, topping: PizzaTopping)
    case chicken(sauce: Bool)
    case rice
}

var dinner: MainDish = MainDish.chicken(sauce: true)
dinner = MainDish.pizza(dough: .original, topping: .pepperoni)
```
