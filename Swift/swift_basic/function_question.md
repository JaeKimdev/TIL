```Swift
import Swift

func hello() -> Void { print("hello") }

hello()

print(hello())

```

## Result

hello() ➡️

`hello`

print(hello()) ➡️

`hello`  
`()`

## # What's different between hello() and print(hello)❓

[Apple Develop - Void](https://developer.apple.com/documentation/swift/void)

애플 디벨로퍼 도큐멘테이션에서 찾아 봤는데, 반환값을 특정(specify)하지 않아도 되는 함수의 경우 함수를 선언할 때 반환값을 적어 줄 필요는 없지만, 그렇게 반환값이 특정되지 않은 함수의 경우 Void라는 반환값을 기본적으로 가진다  
따라서 hello() 함수의 경우 hello라는 String을 출력하는 함수이지만, print(hello())의 경우에는 hello() 함수가 문자열 "hello"를 출력하고 Void( == empty tuple)까지 반환하는 과정을 print()가 감싸고 있어서 두 코드의 실행 결과가 다른 것 같습니다.

## Void ( == Empty tuple)
