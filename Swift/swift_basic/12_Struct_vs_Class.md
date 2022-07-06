## Struct vs Class

###### tags: `Struct`, `Class`, `memberwise`, `deinit`

## 학습내용

> Initialization 초기화

```swift
class PersonA { // error: Class 'PersonA' has no initializers
    var name: String
    var age: Int
}

struct PersonB {
    var name: String
    var age: Int
}

```

- Class는 인스턴스의 프로퍼티에 값이 있다는 것이 항상 보장되어야 한다
- 🤔 Struct는 왜 에러가 발생하지 않지? ➡️ `memberwise`라는 기능을 제공!

:pushpin: **memberwise**
Struct는 상속이 불가능 하기 때문에 해당 struct에서 init이 꼭 필요하기 때문에 Swift에서 자동화 된 기능을 제공, But Class는 상속이 가능하기 때문에 해당 클라스가 서브클라스에서만 초기화되어야 할 필요성이 있을 수 있다.

:pushpin: **deinit**
Class에서만 제공되는 메서드, 클래스의 인스턴스가 메모리에서 해제되는 시점에 호출됨.

## mutating

```swift
class PersonA {
    var name: String
    var age: Int

    init(name: String, age: Int) {
        self.name = name
        self.age = age
    }

    func addOneToAge() {
        self.age += 1
    }
}

struct PersonB {
    var name: String
    var age: Int

    mutating func addOneToAge() {
        self.age += 1
    }
}
```

구조체에서는 자신의 프로퍼티 값을 변경하는 메서드 앞에 `mutating` 키워드를 붙여줘야 한다.

> value Type vs reference Type

```swift
class CameraA {
    var color = "Black"
}

struct CameraB {
    var color = "Black"
}

func printCameraColor() {
    let str = """
Camera A (my: \(myCameraA.color), yours: \(yourCameraA.color))
Camera B (my: \(myCameraB.color). yours: \(yourCameraB.color))
"""
    print(str)
}

var myCameraA = CameraA()
var yourCameraA = myCameraA

var myCameraB = CameraB()
var yourCameraB = myCameraB

printCameraColor()


print("----- myCamera 색을 변경합니다. -----")

myCameraA.color = "White"
myCameraB.color = "White"

printCameraColor()

/*
Camera A (my: Black, yours: Black)
Camera B (my: Black. yours: Black)
----- myCamera 색을 변경합니다. -----
Camera A (my: White, yours: White)
Camera B (my: White. yours: Black)
Program ended with exit code: 0
*/
```
