## # Type Casting

스위프트의 타입캐스팅은 인스턴스의 타입을 확인 하는 용도 또는 클래스의 인스턴스를 부모 혹은 자식 클래스의 타입으로 사용할 수 있는지 확인 하는 용도로 사용합니다. `is`, `as`를 사용합니다.

> 타입 캐스팅 예제를 위한 클래스 정의

```swift
    class Person {
    var name: String = ""
    func breath() {
        print("숨을 쉽니다")
    }
}

class Student: Person {
    var school: String = ""
    func goToSchool() {
        print("등교를 합니다")
    }
}

class UniversityStudent: Student {
    var major: String = ""
    func goToMT() {
        print("멤버쉽 트레이닝을 갑니다 신남!")
    }
}

// 인스턴스 생성
var yagom: Person = Person()
var hana: Student = Student()
var jason: UniversityStudent = UniversityStudent()
```

> 타입 확인

`is`를 사용하여 타입을 확인합니다.

```swift
var result: Bool

result = yagom is Person // true
result = yagom is Student // false
result = yagom is UniversityStudent // false

result = hana is Person // true
result = hana is Student // true
result = hana is UniversityStudent // false

result = jason is Person // true
result = jason is Student // true
result = jason is UniversityStudent // true

if yagom is UniversityStudent {
    print("yagom은 대학생입니다")
} else if yagom is Student {
    print("yagom은 학생입니다")
} else if yagom is Person {
    print("yagom은 사람입니다")
} // yagom은 사람입니다

switch jason {
case is Person:
    print("jason은 사람입니다")
case is Student:
    print("jason은 학생입니다")
case is UniversityStudent:
    print("jason은 대학생입니다")
default:
    print("jason은 사람도, 학생도, 대학생도 아닙니다")
} // jason은 사람입니다

switch jason {
case is UniversityStudent:
    print("jason은 대학생입니다")
case is Student:
    print("jason은 학생입니다")
case is Person:
    print("jason은 사람입니다")
default:
    print("jason은 사람도, 학생도, 대학생도 아닙니다")
} // jason은 대학생입니다
```

> 업 캐스팅 - 자주 사용 ❌

`as`를 사용하여 부모클래스의 인스턴스로 사용할 수 있도록 컴파일러에게 타입정보를 전환해줍니다. Any 혹은 AnyObject로도 타입정보를 변환할 수 있습니다. 암시적으로 처리되므로 꼭 필요한 경우가 아니라면 생략해도 무방합니다.

```swift
// UniversityStudent 인스턴스를 생성하여 Person 행세를 할 수 있도록 업 캐스팅
var mike: Person = UniversityStudent() as Person

var jenny: Student = Student()
//var jina: UniversityStudent = Person() as UniversityStudent // 컴파일 오류

// UniversityStudent 인스턴스를 생성하여 Any 행세를 할 수 있도록 업 캐스팅
var jina: Any = Person() // as Any 생략가능
```

> 다운 캐스팅

    `as?` 또는 `as!`를 사용하여 자식 클래스의 인스턴스로 사용할 수 있도록 컴파일러에게 인스턴스의 타입정보를 전환해줍니다.

- 조건부 다운 캐스팅

  as?를 사용합니다. 캐스팅에 실패하면, 즉 캐스팅하려는 타입에 부합하지 않는 인스턴스라면 nil을 반환하기 때문에 결과의 타입은 옵셔널 타입입니다.

  ```swift
  var optionalCasted: Student?

  optionalCasted = mike as? UniversityStudent
  optionalCasted = jenny as? UniversityStudent // nil
  optionalCasted = jina as? UniversityStudent // nil
  optionalCasted = jina as? Student // nil
  ```

- 강제 다운 캐스팅

  as!를 사용합니다. 캐스팅에 실패하면, 즉 캐스팅하려는 타입에 부합하지 않는 인스턴스라면 런타임 오류가 발생합니다. 캐스팅에 성공하면 옵셔널이 아닌 일반 타입을 반환합니다.

  ```swift
  var forcedCasted: Student

  optionalCasted = mike as! UniversityStudent
  //optionalCasted = jenny as! UniversityStudent // 런타임 오류
  //optionalCasted = jina as! UniversityStudent // 런타임 오류
  //optionalCasted = jina as! Student // 런타임 오류
  ```

> 활용

```swift
func doSomethingWithSwitch(someone: Person) {
    switch someone {
    case is UniversityStudent:
        (someone as! UniversityStudent).goToMT()
    case is Student:
        (someone as! Student).goToSchool()
    case is Person:
        (someone as! Person).breath()
    }
}

doSomethingWithSwitch(someone: mike as Person) // 멤버쉽 트레이닝을 갑니다 신남!
doSomethingWithSwitch(someone: mike) // 멤버쉽 트레이닝을 갑니다 신남!
doSomethingWithSwitch(someone: jenny) // 등교를 합니다
doSomethingWithSwitch(someone: yagom) // 숨을 쉽니다


func doSomething(someone: Person) {
    if let universityStudent = someone as? UniversityStudent {
        universityStudent.goToMT()
    } else if let student = someone as? Student {
        student.goToSchool()
    } else if let person = someone as? Person {
        person.breath()
    }
}

doSomething(someone: mike as Person) // 멤버쉽 트레이닝을 갑니다 신남!
doSomething(someone: mike) // 멤버쉽 트레이닝을 갑니다 신남!
doSomething(someone: jenny) // 등교를 합니다
doSomething(someone: yagom) // 숨을 쉽니다
```

> 프로토콜과 타입 캐스팅

프로토콜에 대해서도 역시 타입 캐스팅을 해줄 수 있습니다. 프로토콜을 채택하고 있는지 확인하는 것은 물론, 프로토콜로서 타입 캐스팅을 통해 프로토콜에서 정의된 프로퍼티와 메서드를 사용해줄 수 있습니다.

```swift
protocol Workable {
    var tool: String? { get set }

    func work()
}

struct Baby {
    let name: String
}

struct Developer: Workable {
    var tool: String? = "Mac"

    func work() {
        print("키보드 뚝딱뚝딱")
    }
}

struct Carpenter: Workable {
    var tool: String? = "hammer"

    func work() {
        print("의자를 뚝딱뚝딱")
    }
}

let baby = Baby(name: "yagom")
let developer = Developer()
let carpenter = Carpenter()

let list: [Any] = [baby, developer, carpenter]

func makeWork() {
    print("일할 수 있는 사람은 일해야죠?")

    for person in list {
        if let workablePerson = person as? Workable {
            print("넵..")
            workablePerson.work()
        } else {
            print("전 일 못해요...")
        }
    }
}

makeWork()
```

## Reference

[Swift Docs - Type Casting](https://docs.swift.org/swift-book/LanguageGuide/TypeCasting.html)
