## # Class vs Struct / Enum

> - Struct과 Enum은 **값 타입(Value Type)** 이며, Class는 **참조 타입(Reference Type)** 이라는 것이 가장 큰 차이입니다.
> - 또한, Class는 **상속이 가능(단일상속!)** 하지만 Struct / Enum은 **상속이 불가능**합니다.

```swift
struct ValueType {
    var property = 1
}

class ReferenceType {
    var property = 1
}

// 첫 번째 구조체 인스턴스
let firstStructInstance = ValueType()
// 두 번째 구조체 인스턴스에 첫 번째 인스턴스 값 복사
var secondStructInstance = firstStructInstance
// 두 번째 구조체 인스턴스 프로퍼티 값 수정
secondStructInstance.property = 2

// 두 번째 구조체 인스턴스는 첫 번째 구조체를 똑같이 복사한 별도의 인스턴스이기 때문에
// 두 번째 구조체 인스턴스의 프로퍼티 값을 변경해도 첫 번째 구조체 인스턴스의 프로퍼티 값에는 영향이 없음
print("first struct instance property : \(firstStructInstance.property)")    // 1
print("second struct instance property : \(secondStructInstance.property)")  // 2

// 클래스 인스턴스 생성 후 첫 번째 참조 생성
let firstClassReference = ReferenceType()
// 두 번째 참조 변수에 첫 번째 참조 할당
let secondClassReference = firstClassReference
secondClassReference.property = 2

// 두 번째 클래스 참조는 첫 번째 클래스 인스턴스를 참조하기 때문에
// 두 번째 참조를 통해 인스턴스의 프로퍼티 값을 변경하면
// 첫 번째 클래스 인스턴스의 프로퍼티 값을 변경하게 됨
print("first class reference property : \(firstClassReference.property)")    // 2
print("second class reference property : \(secondClassReference.property)")  // 2
```

> Struct vs Class

```swift
struct SomeStruct {
    var someProperty: String = "Property"
}
var someStructInstance: SomeStruct = SomeStruct()

func somefunction(structInstance: SomeStruct) {
    var localVar: someStruct = structInstance
    localVar.someProperty = "ABC"
}

somefunction(someStructInstance)
print(someStructInstance.someProperty) // "Property"
// -> struct가 함수에서 전달이 될때는 복사가 되어서 전달이 되기 때문에 프로퍼티 값이 변경되지 않음

class SomeStruct {
    var someProperty: String = "Property"
}
var someClassInstance: SomeClass = SomeClass()

func somefunction(classInstance: SomeClass) {
    var localVar: SomeClass = classInstance
    localVar.someProperty = "ABC"
}

somefunction(someClassInstance)
print(someClassInstance.someProperty) // "ABC"
// 참조값이 전달이 되어서 프로퍼티 값이 변경됨
```

## # Reference

[Swift Docs - Classes and Structures](https://developer.apple.com/library/content/documentation/Swift/Conceptual/Swift_Programming_Language/ClassesAndStructures.html)

[Swift Docs - Enumerations](https://developer.apple.com/library/content/documentation/Swift/Conceptual/Swift_Programming_Language/Enumerations.html)
