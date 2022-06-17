## # 반복문

- for-in
- while
- repeat-while

## # for-in

> for-in 구문의 기본 형태

```Swift
for item in items {
    /* 실행 구문 */
}
```

> for-in 구문의 사용

```Swift
var integers = [1, 2, 3]
let people = ["yagom": 10, "eric": 15, "mike": 12]

for integer in integers {
    print(integer)
}

// Dictionary의 item은 key와 value로 구성된 튜플 타입입니다
for (name, age) in people {
    print("\(name): \(age)")
}
```

## # While 구문

> while 구문의 기본 형태

```Swift
while 조건 {
    /* 실행 구문 */
}
```

> while 구문의 사용

```Swift
while integers.count > 1 {
    integers.removeLast()
}
```

## # repeat-while 구문

> repeat-while 구문의 기본 형태

```Swift
repeat {
    /* 실행 구문 */
} while 조건
```

> repeat-while 구문의 사용

```Swift
repeat {
    integers.removeLast()
} while integers.count > 0
```

## Reference

[Swift Doc - Control Flow](https://docs.swift.org/swift-book/LanguageGuide/ControlFlow.html)
