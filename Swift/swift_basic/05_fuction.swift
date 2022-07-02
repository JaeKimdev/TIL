import Swift

// 함수 선언의 기본 형태
func sum(a: Int, b: Int) -> Int {
    return a + b
}

// 반환값이 없는 함수
func printMyName(name: String) -> Void {
    print(name)
}

func printYourName(name: String) {
    print(name)
}

func maximumIntegerValue() -> Int {
    return Int.max
}

func hello() -> Void { print("hello") }

func bye() { print("bye") }

print(sum(a: 3, b: 5))

printMyName(name: "mene")

printYourName(name: "hana")

print(maximumIntegerValue())

hello()

print(hello())

bye()

func printHelloWorld() {
    print("Hello, World!")
}

printHelloWorld()

// 매개변수 기본값

/*
 func 함수이름(매개변수1이름: 매개변수1타입, 매개변수2이름: 매개변수2타입 = 매개변수 기본값 ...) -> 반환타입 {
 /* 함수 구현부 */
 return 반환값
 }
 */

func greeting(friend: String, me: String = "Jae") {
    print("Hello \(friend)! I'm \(me)")
}

// 매개변수 기본값을 가지는 매개변수는 호출시 생략할 수 있습니다
greeting(friend: "Hana") // Hello Hana! I'm Jae
greeting(friend: "John", me: "Eric") // Hello John! I'm Eric

// 전달인자 레이블

/*
 func 함수이름(전달인자 레이블 매개변수1이름: 매개변수1타입, 전달인자 레이블 매개변수2이름: 매개변수2타입 ...) -> 반환타입 {
 /* 함수 구현부 */
 return
 }
 */

// 함수 내부에서 전달인자를 사용할 때에는 매개변수 이름을 사용합니다
func greeting(to friend: String, from me: String) {
    print("Hello \(friend)! I'm \(me)")
}

// 함수를 호출할 때에는 전달인자 레이블을 사용해야 합니다
greeting(to: "Hana", from: "Jae") // Hello Hana! I'm Jae

// 가변 매개변수 - 전달받을 값의 개수를 알기 어려울 때 사용

/*
 func 함수이름(매개변수1이름: 매개변수1타입, 전달인자 레이블 매개변수2이름: 매개변수2타입...) -> 반환타입 {
 /* 함수 구현부 */
 return
 }
 */

func sayHelloToFriends(me: String, friends: String...) -> String {
    return "Hello \(friends)! I'm \(me)!"
}
print(sayHelloToFriends(me: "Jae", friends: "Hana", "Eric", "John"))
// Hello ["Hana", "Eric", "John"]! I'm Jae!

print(sayHelloToFriends(me: "Jae"))
// Hello []! I'm Jae!


// 함수 타입 사용 - 함수를 호출

var someFunction: (String, String) -> Void = greeting(to:from:)
someFunction("Eric", "Jae") // Hello Eric! I'm Jae

someFunction = greeting(friend:me:)
someFunction("Eric", "Jae") // Hello Eric! I'm Jae


// 타입이 다른 함수는 할당할 수 없습니다 - 컴파일 오류 발생 (friends가 가변 매개변수를 가짐)
// someFunction = sayHelloToFriends(me: friends:)


func runAnother(function: (String, String) -> Void) {
    function("Jenny", "Mike")
}

// Hello Jenny! I'm Mike
runAnother(function: greeting(friend:me:))

// Hello Jenny! I'm Mike
runAnother(function: someFunction)
