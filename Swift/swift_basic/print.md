# print(\_:separator:terminator:)

## Declaration - 정의

```Swift
func print(
    _ items: Any..., // 인자를 여러개 받을 수 있다
    separator: String = " ", // 기본값은 띄어쓰기
    terminator: String = "\n" // 기본값 줄바꿈
)
```

### 사용 예제

- When you’re debugging an app on your iPhone via Xcode, output from print() shows up in `Xcode’s Console`
- It works in `Xcode playgrounds`, as we’ve seen in the above example
- If you run code through the swift command line tool, output shows up `in Terminal`

```Swift
print(1, 2, 3) // 1 2 3
print(1...5) // 1...5
print(1, 2, 3, separator: "!") // 1!2!3!
print(1, 2, 3, separator: "") // 123
```

> 인자는 String 타입으로 전달되기 때문에 `1..5`를 입력하여도 for문에서와 같이 1,2,3,4,5가 출력되지는 않는다.

```Swift
//print 함수는 기본적으로 줄바꿈 되어 출력됨
print("내가 좋아하는 계절 : ")
print("봄")

// Output
// 내가 좋아하는 계절 :
// 봄

// 줄바꿈을 하지 않기 위해서는 terminator 매개변수에 원하는 인자를 전달
print("내가 좋아하는 계절", terminator: " : ")
print("봄")

// seperator와 terminator 매개변수는 동시에 사용하거나 아예 사용하지 않을 수 있다
// 단, 동시에 사용할 때는 seperator가 terminator보다 먼저 위치해야 함
print("내가 좋아하는 숫자", terminator: " : ")
print(1, 2, 3, separator: ", ", terminator: " 모두!")
```

## Reference

[Apple Developer Doc - print](<https://developer.apple.com/documentation/swift/print(_:separator:terminator:)/>)
