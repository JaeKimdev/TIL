# Function 함수

## # 함수선언의 기본형태

```Swift
func 함수이름(매개변수1이름: 매개변수1타입, 매개변수2이름: 매개변수2타입 ...) -> 반환타입 {
    /* 함수 구현부 */
    return 반환값
}

// 예)
// sum이라는 이름을 가지고
// a와 b라는 Int 타입의 매개변수를 가지며
// Int 타입의 값을 반환하는 함수
func sum(a: Int, b: Int) -> Int {
    return a + b
}
```

## # 반환 값이 없는 함수

```Swift
func 함수이름(매개변수1이름: 매개변수1타입, 매개변수2이름: 매개변수2타입 ...) -> Void {
    /* 함수 구현부 */
    return
}

// 예)
func printMyName(name: String) -> Void {
    print(name)
}

// 반환 값이 없는 경우, 반환 타입(Void)을 생략해 줄 수 있습니다
func printYourName(name: String) {
    print(name)
}
```

## # 매개변수가 없는 함수

```Swift
func 함수이름() -> 반환타입 {
    /* 함수 구현부 */
    return 반환값
}

// 예)
func maximumIntegerValue() -> Int {
    return Int.max
}
```

## # 매개변수와 반환값이 없는 함수

```Swift
func 함수이름() -> Void {
    /* 함수 구현부 */
    return
}

// 함수 구현이 짧은 경우
// 가독성을 해치지 않는 범위에서
// 줄바꿈을 하지 않고 한 줄에 표현해도 무관합니다
func hello() -> Void { print("hello") }


// 반환 값이 없는 경우, 반환 타입(Void)을 생략해 줄 수 있습니다
func 함수이름() {
    /* 함수 구현부 */
    return
}

func bye() { print("bye") }
```

> 함수의 호출

```Swift
sum(a: 3, b: 5) // 8

printMyName(name: "jae") // jae

printYourName(name: "hana") // hana

maximumIntegerValue() // Int의 최댓값

hello() // hello

bye() // bye
```

## # 매개변수 기본 값

> 기본값을 갖는 매개변수는 매개변수 목록 중에 뒤쪽에 위치하는 것이 좋습니다

```Swift
func 함수이름(매개변수1이름: 매개변수1타입, 매개변수2이름: 매개변수2타입 = 매개변수 기본값 ...) -> 반환타입 {
    /* 함수 구현부 */
    return 반환값
}

func greeting(friend: String, me: String = "Jae") {
    print("Hello \(friend)! I'm \(me)")
}

// 매개변수 기본값을 가지는 매개변수는 호출시 생략할 수 있습니다
greeting(friend: "Hana") // Hello Hana! I'm Jae
greeting(friend: "John", me: "Eric") // Hello John! I'm Eric
```

## # 전달인자 레이블

> 함수를 호출할 때 함수 사용자의 입장에서 매개변수의 역할을 좀 더 명확하게 표현하고자 할 때 사용합니다

```Swift
func 함수이름(전달인자 레이블 매개변수1이름: 매개변수1타입, 전달인자 레이블 매개변수2이름: 매개변수2타입 ...) -> 반환타입 {
    /* 함수 구현부 */
    return
}

// 함수 내부에서 전달인자를 사용할 때에는 매개변수 이름을 사용합니다
func greeting(to friend: String, from me: String) {
    print("Hello \(friend)! I'm \(me)")
}

// 함수를 호출할 때에는 전달인자 레이블을 사용해야 합니다
greeting(to: "Hana", from: "Jae") // Hello Hana! I'm Jae
```

## # 가변 매개변수

> 전달받을 값의 개수를 알기 어려울 때 사용할 수 있습니다.  
> 가변 매개변수는 함수당 하나만 가질 수 있습니다.

```Swift
func 함수이름(매개변수1이름: 매개변수1타입, 전달인자 레이블 매개변수2이름: 매개변수2타입...) -> 반환타입 {
    /* 함수 구현부 */
    return
}

func sayHelloToFriends(me: String, friends: String...) -> String {
    return "Hello \(friends)! I'm \(me)!"
}
print(sayHelloToFriends(me: "Jae", friends: "Hana", "Eric", "John"))
// Hello ["Hana", "Eric", "John"]! I'm Jae!

print(sayHelloToFriends(me: "Jae"))
// Hello []! I'm Jae!
```

## # 데이터 타입으로서의 함수

> 스위프트는 함수형 프로그래밍 패러다임을 포함하는 다중 패러다임 언어이므로 스위프트의 함수는 일급객체입니다.  
> 그래서 함수를 변수, 상수 등에 할당이 가능하고 매개변수를 통해 전달할 수도 있습니다

## # 함수 타입표현

> 변환타입을 생략할 수 없습니다.

    (매개변수1타입, 매개변수2타입 ...) -> 반환타입

## # 함수타입 사용

```Swift
var someFunction: (String, String) -> Void = greeting(to:from:)
someFunction("Eric", "Jae") // Hello Eric! I'm Jae

someFunction = greeting(friend:me:)
someFunction("Eric", "Jae") // Hello Eric! I'm Jae


// 타입이 다른 함수는 할당할 수 없습니다 - 컴파일 오류 발생 (friends가 가변 매개변수를 가짐)
//someFunction = sayHelloToFriends(me: friends:)


func runAnother(function: (String, String) -> Void) {
    function("Jenny", "Mike")
}

// Hello Jenny! I'm Mike
runAnother(function: greeting(friend:me:))

// Hello Jenny! I'm Mike
runAnother(function: someFunction)
```

## Reference

[Swift Doc - function](https://docs.swift.org/swift-book/LanguageGuide/Functions.html)
