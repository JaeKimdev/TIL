# Swift의 기본 데이터 타입

- Bool
- Int, UInt
- Float, Double
- Character, String

## # Bool

`true`와 `false`만을 값으로 가지는 타입

```Swift
var someBool: Bool = true
someBool = false
// someBool = 0 // Compile Error
// someBool = 1 // Compile Error
```

## # Int, UInt

> Int - 정수 타입. 기본적으로 64비트 정수형. (양수와 음수 0 모두를 포함)

```Swift
var someInt: Int = -100
// someInt = 100.1 // Compile Error
```

> UInt - 양의 정수 타입. 기본적으로 64비트 양의 정수형.

```Swift
var someUInt: UInt = 100
// someUInt = -100 // Compile Error
// someUInt = someInt // Compile Error
```

## # Float, Double

> Float - 실수 타입. 32비트 부동소수형

```Swift
var someFloat: Float = 3.14
someFloat = 3
```

> Double - 실수타입. 64비트 부동소수형

```Swift
var someDouble: Double = 3.14
someDouble = 3
// someDouble = someFloat // Compile Error
```

## Character, String

> Character - 문자 타입. 유니코드 사용. 큰따옴표("") 사용.

```Swift
var someCharacter: Character = "🇰🇷"
someCharacter = "😄"
someCharacter = "가"
someCharacter = "A"
// someCharacter = "하하하" // Compile Error - 한글자가 아니기 때문에
print(someCharacter)
```

> String - 문자열 타입. 유니코드 사용. 큰따옴표("") 사용.

```Swift
var someString: String = "하하하 😄 "
someString = someString + "웃으면 복이와요"
print(someString)
// someString = someCharacter // Compile Error
```

# Any, AnyObject, nil

- Any : Swift의 모든 타입을 지칭하는 키워드
- AnyObject : 모든 클래스 타입을 지칭하는 프로토콜
- nil : 없음을 의미하는 키워드

## # Any

> Swift의 모든 타입을 지칭하는 키워드

```Swift
var someAny: Any = 100
someAny = "어떤 타입도 수용 가능합니다"
someAny = 123.12

// Any 타입에 Double 자료를 넣어두었더라도 Any는 Double 타입이 아니기 때문에 할당할 수 없습니다.
// 명시적으로 타입을 변환해 주어야 합니다.

let someDouble: Double = someAny  // Compile Error
```

## # AnyObject

> 모든 클래스 타입을 지칭하는 프로토콜

```Swift
class SomeClass {}

var someAnyObject: AnyObject = SomeClass()

// AnyObject는 클래스의 인스턴스만 수용 가능하기 때문에 클래스의 인스턴스가 아니면 할당할 수 없습니다.

someAnyObject = 123.12    // Compile Error

```

## # nil

> 없음을 의미하는 키워드, 다른 언어의 `NULL`, `Null`, `null` 등과 유사한 표현입니다.

```Swift
// 아래 코드에서 someAny는 Any 타입이고, someAnyObject는 AnyObject 타입이기 때문에 nil을 할당할 수 없습니다.
someAny = nil         // Compile Error
someAnyObject = nil   // Compile Error
```

## Reference

[The Swift Programming Language - The Basics](https://docs.swift.org/swift-book/LanguageGuide/TheBasics.html)
