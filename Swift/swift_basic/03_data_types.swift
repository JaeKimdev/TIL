import Foundation

/* 기본 데이터 타입 */
// Bool, Int, UInt, Float, Double, Character, String

// Bool
var someBool: Bool = true
someBool = false
// someBool = 0 // Error
// someBool = 1 // Error
let iLoveYou: Bool = true
let isTimeUnlimited: Bool = false
print("시간은 무한합니까?: \(isTimeUnlimited)")

// Int - 정수 타입. 기본적으로 64비트 정수형. (양수와 음수 0 모두를 포함)
var someInt: Int = -100
// someInt = 100.1 // Error
var integer: Int = -100
let unsignedInteger: UInt = 50 // UInt 타입에는 음수값을 할당할 수 없습니다.

print("integer 값: \(integer), unsignedInteger 값: \(unsignedInteger)")

// let cannotBeNegetive: UInt = -5 // UInt는 음수가 될 수 없으므로 오류를 냅니다.

// integer = unsignedInteger  // 오류! 스위프트에서 Int와 UInt는 다른 타입입니다.
integer = Int(unsignedInteger)  // Int 타입의 값으로 할당해주어야 합니다.

// UInt - 양의 정수 타입. 기본적으로 64비트 양의 정수형.
var someUInt: UInt = 100
// someUInt = -100 // Compile Error
// someUInt = someInt // Compile Error

// Float - 실수 타입. 32비트 부동소수형-6자리 숫자까지만 표현 가능
var someFloat: Float = 3.14
someFloat = 3

// Float이 수용할 수 있는 범위를 넘어섭니다.
// 자신이 감당할 수 있는 만큼만 남기므로 정확도가 떨어집니다.
var floatValue: Float = 1234567890.1

// Double은 충분히 수용할 수 있습니다.
let doubleValue: Double = 1234567890.1
   
print("floatValue: \(floatValue) doubleValue : \(doubleValue)") //floatValue: 1.234568e+09 doubleValue : 1234567890.1

// Float이 수용할 수 있는 범위의 수로 변경합니다.
floatValue = 123456.1

// 문자열 보간법을 사용하지 않고 단순히 변수 또는 상수의 값만 보고 싶으면
// print 함수의 전달인자로 변수 또는 상수를 전달하면 됩니다.
print(floatValue)


// Double - 실수타입. 64비트 부동소수형
var someDouble: Double = 3.14
someDouble = 3 // 정수타입의 값도 입력 가능 출력은 3.0
// someDouble = someFloat // Compile Error
print(someDouble)

// Character - 문자 타입. 유니코드 사용. 큰따옴표("") 사용.
var someCharacter: Character = "🇰🇷"
someCharacter = "😄"
someCharacter = "가"
someCharacter = "A"
// someCharacter = "하하하" // Compile Error - 한글자가 아니기 때문에
let alphabetA: Character = "A"
print(alphabetA)

// Character 값에 유니코드 문자를 사용할 수 있습니다.
let commandCharacter: Character = "♡"
print(commandCharacter)

let 한글변수이름: Character = "ᄀ"

// 한글도 유니코드 문자에 속하므로 스위프트 코드의 변수 이름으로 사용할 수 있습니다.
print("한글의 첫 자음: \(한글변수이름)")

print(someCharacter)

// String - 문자열 타입. 유니코드 사용. 큰따옴표("") 사용.
var someString: String = "하하하 😄 "
someString = someString + "웃으면 복이와요"
print(someString)
// someString = someCharacter // Error

// 상수로 선언된 문자열은 변경이 불가능합니다.
let name: String = "mene"

// 이니셜라이저를 사용하여 빈 문자열을 생성할 수 있습니다.
// var 키워드를 사용하여 변수를 생성했으므로 문자열의 수정 및 변경이 가능합니다.
var introduce: String = String()

// append() 메서드를 사용하여 문자열을 이어붙일 수 있습니다.
introduce.append("제 이름은")

// + 연산자를 통해서도 문자열을 이어붙일 수 있습니다.
introduce = introduce + " " + name + "입니다."
print(introduce)

// name에 해당하는 문자의 수를 셀 수 있습니다.
print("name의 글자 수: \(name.count)")

// 빈 문자열인지 확인해볼 수 있습니다.
print("introduce가 비어있습니까?: \(introduce.isEmpty)")

// 연산자를 통한 문자열 비교
var isSameString: Bool = false

// 프로그래밍에서 비교의 참과 거짓을 얻어낼 때 == 연산자를 사용합니다
// A == B를 한글로 해석해보면 A는 B와 같은가? 라는 뜻입니다
var hello: String = "Hello"
isSameString = hello == "Hello"
print("isSameString: ",isSameString) // true

isSameString = hello == "hello"
print("isSameString: ",isSameString) // false

/* 문자열 고급 */

// 메서드를 통한 접두어, 접미어 확인
var hasPrefix: Bool = false

hasPrefix = hello.hasPrefix("He")
print("hasPrefix: ",hasPrefix) // true

hasPrefix = hello.hasPrefix("HE")
print("hasPrefix: ",hasPrefix) // false

var hasSuffix: Bool = false

hasSuffix = hello.hasSuffix("He")
print("hasSuffix: ",hasSuffix) // false

hasSuffix = hello.hasSuffix("llo")
print("hasSuffix: ",hasSuffix) // true

// 메서드를 통한 대소문자 변환
var convertedString: String = ""

convertedString = hello.uppercased()
print("uppercased: ",convertedString) // HELLO

convertedString = hello.lowercased()
print("lowercased: ",convertedString)  // hello

print("문자열 내부에\n 이런 \"특수문자\"를\t사용하면 \\이런 놀라운 결과를 볼 수 있습니다")
print(#"문자열 내부에서 특수문자를 사용하기 싫다면 문자열 앞, 뒤에 #을 붙여주세요"#)
let number: Int = 100
print(#"특수문자를 사용하지 않을 때도 문자열 보간법을 사용하고 싶다면 이렇게 \#(number) 해보세요"#)
