## # Constant, Variable 상수, 변수의 선언

    상수 선언 키워드 let
    변수 선언 키워드 var

```Swift
// 상수의 선언
let name: type = value

// 변수의 선언
var name: type = value

// 값이 타입이 명확하다면 타입은 생략 가능
let name = value

let constant: String = "mutable name let"
var variable: String = "immutable name var"

variable = "Can change later"
constant = "Cannot change" // error
```

## # 상수 선언 후 나중에 값 할당하기

```Swift
let sum: Int
let inputA: Int = 100
let inputB: Int = 200

// 선언 후 첫 할당
sum = inputA + inputB

sum = 1 // error 한번 선언 후에는 다시 값을 바꿀 수 없다
```

## # 생각해보기

```Swift
let name = "Jae"
var numberToAdd = 5
let pi = 3.14195
let maxItemCount = 1000
```

## # 관련문서

[The Swift Programming Language - The Basic](https://docs.swift.org/swift-book/LanguageGuide/TheBasics.html)
