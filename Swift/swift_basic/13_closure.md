## # Closer 클로저

> 코드의 블럭을 클로저라고 한다  
> 일급시민으로 전달인자, 변수, 상수 등으로 저장, 전달이 가능  
> 함수도 클로저의 일종으로 named Closer라고 생각하면 된다

```Swift
{ (매개변수 목록) -> 반환타입 in
    실행 코드
}
```

> 클로저의 사용

```Swift
// sum이라는 상수에 클로저를 할당
let sum: (Int, Int) -> Int = { (a: Int, b: Int) in
    return a + b
}

let sumResult: Int = sum(1, 2)
print(sumResult) // 3
```

> 함수의 전달인자로서의 클로저

```Swift
let add: (Int, Int) -> Int
add = { (a: Int, b: Int) in
    return a + b
}

let substract: (Int, Int) -> Int
substract = { (a: Int, b: Int) in
    return a - b
}

let divide: (Int, Int) -> Int
divide = { (a: Int, b: Int) in
    return a / b
}

func calculate(a: Int, b: Int, method: (Int, Int) -> Int) -> Int {
    return method(a, b)
}

var calculated: Int

calculated = calculate(a: 50, b: 10, method: add)

print(calculated) // 60

calculated = calculate(a: 50, b: 10, method: substract)

print(calculated) // 40

calculated = calculate(a: 50, b: 10, method: divide)

print(calculated) // 5

//따로 클로저를 상수/변수에 넣어 전달하지 않고,
//함수를 호출할 때 클로저를 작성하여 전달할 수도 있습니다.

calculated = calculate(a: 50, b: 10, method: { (left: Int, right: Int) -> Int in
    return left * right
})

print(calculated) // 500
```

## # 다양한 클로저 표현

> ### 후행클로저 - 클로저가 함수의 마지막 전달인자라면, 마지막 매개변수 이름을 생략한 후,
>
> 함수 소괄호 외부에 클로저를 구현할 수 있습니다.

```Swift
result = calculate(a: 10, b: 10) { (left: Int, right: Int) -> Int in
    return left + right
}

print(result) // 20
```

> 반환타입 생략 - 매개변수는 Int 타입을 반환할 것이라는 것을 컴파일러도 알기 때문에 반환타입 생략가능, 단! `in` 키워드는 생략할 수 없습니다.

```Swift
result = calculate(a: 10, b: 10, method: { (left: Int, right: Int) /* -> Int */ in
    return left + right
})

print(result) // 20

// 후행클로저와 함께 사용할 수도 있습니다
result = calculate(a: 10, b: 10) { (left: Int, right: Int) in
    return left + right
}

print(result) // 20
```

> 단축 인자 이름

- 단축 인자이름은 클로저의 매개변수의 순서대로 $0, $1, $2... 처럼 표현합니다.

```Swift
result = calculate(a: 10, b: 10, method: {
    return $0 + $1
})

print(result) // 20


// 당연히 후행 클로저와 함께 사용할 수 있습니다
result = calculate(a: 10, b: 10) {
    return $0 + $1
}

print(result) // 20
```

> 암시적 반환 표현 - 반환하는 값이 있다면 마지막줄은 암시적으로 반환값으로 취급(return 생략 가능)

```Swift
result = calculate(a: 10, b: 10) {
    $0 + $1
}

print(result) // 20

// 간결하게 한 줄로 표현해 줄 수도 있습니다
result = calculate(a: 10, b: 10) { $0 + $1 }

print(result) // 20
```

> 축약하기 전과 비교

```Swift
//축약 전
result = calculate(a: 10, b: 10, method: { (left: Int, right: Int) -> Int in
    return left + right
})

//축약 후
result = calculate(a: 10, b: 10) { $0 + $1 }

print(result) // 20
```

## Reference

[The Swift Programming Language - Closures](https://developer.apple.com/library/content/documentation/Swift/Conceptual/Swift_Programming_Language/Closures.html)
