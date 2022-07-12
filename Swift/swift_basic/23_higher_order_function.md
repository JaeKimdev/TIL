## Higher Order Function 고차함수

> 전달인자로 함수를 전달받거나 함수실행의 결과를 함수로 반환하는 함수

- `map` - 컨테이너 내부의 기존 데이터를 변형(transform)하여 새로운 컨테이너를 생성
- `filter` - filter 함수는 컨테이너 내부의 값을 걸러서 새로운 컨테이너로 추출합니다.
- `reduce` - reduce함수는 컨테이너 내부의 콘텐츠를 하나로 통합합니다.

```swift
let numbers: [Int] = [0, 1, 2, 3, 4]
var doubledNumbers: [Int]
var strings: [String]
```

> 기존의 for 구문을 사용한다면..

```swift
doubledNumbers = [Int]()
strings = [String]()

for number in numbers {
    doubledNumbers.append(number * 2)
    strings.append("\(number)")
}

print(doubledNumbers) // [0, 2, 4, 6, 8]
print(strings) // ["0", "1", "2", "3", "4"]
```

> map 메서드 사용

```swift
// numbers의 각 요소를 2배하여 새로운 배열 반환
doubledNumbers = numbers.map({ (number: Int) -> Int in
    return number * 2
})
/* Same as above
var doubledNumbers = numbers.ㅇmap { num in
    num * 2
}
var doubledNumbers = numbers.map { return $0 * 2 }
var doubledNumbers = numbers.map { $0 * 2 }
*/

// numbers의 각 요소를 문자열로 변환하여 새로운 배열 반환
strings = numbers.map({ (number: Int) -> String in
    return "\(number)"
})

print(doubledNumbers) // [0, 2, 4, 6, 8]
print(strings) // ["0", "1", "2", "3", "4"]

// 매개변수, 반환 타입, 반환 키워드(return) 생략, 후행 클로저
doubledNumbers = numbers.map { $0 * 2 }
print(doubledNumbers) // [0, 2, 4, 6, 8]
```

> filter 메서드 사용

```swift
// numbers의 요소 중 짝수를 걸러내어 새로운 배열로 반환
let evenNumbers: [Int] = numbers.filter { (number: Int) -> Bool in
    return number % 2 == 0
}
print(evenNumbers) // [0, 2, 4]

// 매개변수, 반환 타입, 반환 키워드(return) 생략, 후행 클로저
let oddNumbers: [Int] = numbers.filter {
    $0 % 2 != 0
}
print(oddNumbers) // [1, 3]
```

> reduce 메서드 사용

```swift
let someNumbers: [Int] = [2, 8, 15]

// 초깃값이 0이고 someNumbers 내부의 모든 값을 더합니다.
let sum: Int = someNumbers.reduce(0, { (first: Int, second: Int) -> Int in
    //print("\(first) + \(second)") //어떻게 동작하는지 확인해보세요
    return first + second
})

print(sum)  // 25

// 초깃값이 0이고 someNumbers 내부의 모든 값을 뺍니다.
var subtract: Int = someNumbers.reduce(0, { (first: Int, second: Int) -> Int in
    //print("\(first) - \(second)") //어떻게 동작하는지 확인해보세요
    return first - second
})

print(subtract) // -25

// 초깃값이 3이고 someNumbers 내부의 모든 값을 더합니다.
let sumFromThree = someNumbers.reduce(3) { $0 + $1 }

print(sumFromThree) // 28

print(someNumbers.reduce(1) { $0 * $1 }) // 240
print(someNumbers.reduce(0) { $0 * $1 }) // 0 - 초기값이 0이라 뭘 곱해도 다 0
```

> compactMap - 컨테이너 내부에 옵셔널이 있다면 nil값을 제외하고 새로운 컨테이너로 반환

```swift
let possibleNumbers = ["1", "2", "three", "///4///", "5"]
let mapped: [Int?] = possibleNumbers.map { str in Int(str) }
// [1, 2, nil, nil, 5]
let compactMapped: [Int] = possibleNumbers.compactMap { str in Int(str) }
// [1, 2, 5]
```

> flatMap - 중첩된 배열을 제거하고 1차원의 평평한 배열을 리턴

```swift
let numbers = [1, 2, 3, 4]

let mapped = numbers.map { Array(repeating: $0, count: $0) }
// [[1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]

let flatMapped = numbers.flatMap { Array(repeating: $0, count: $0) }
// [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
```

> 'flatMap'과 'compactMap'비교

✔️ 1차원 배열의 경우

```swift
let array1 = [1, nil, 3, nil, 5, 6, 7]
let flatMapTest1 = array1.flatMap{ $0 }
let compactMapTest1 = array1.compactMap { $0 }

print("flatMapTest1 :", flatMapTest1)
print("compactMapTest1 :", compactMapTest1)

<출력>
flatMapTest1 : [1, 3, 5, 6, 7]
compactMapTest1 : [1, 3, 5, 6, 7]
```

    ➡️ 1차원 배열의 경우 'flatMap'과 'compactMap'의 결과가 같다.

✔️ 2차원 배열의 경우

```swift
let array2: [[Int?]] = [[1, 2, 3], [nil, 5], [6, nil], [nil, nil]]
let flatMapTest2 = array2.flatMap { $0 }
let compactMapTest2 = array2.compactMap { $0 }

print("flatMapTest2 :",flatMapTest2)
print("compactMapTest2 :",compactMapTest2)

<출력>
// flatMapTest2 : [Optional(1), Optional(2), Optional(3), nil, Optional(5), Optional(6), nil, nil, nil]
// compactMapTest2 : [[Optional(1), Optional(2), Optional(3)], [nil, Optional(5)], [Optional(6), nil], [nil, nil]]
```

    ➡️ `flatMap` `compactMap` 모두 nil이 제거되지 않고 출력됨.
    ➡️ `flatMap`은 1차원 배열로 변환되지만 `compactMap`은 1차원 배열로 변환되지 않음

🤔 2차원 배열에 nil 값이 섞여있는 경우 flatMap후에 반환되는 1차원 배열에 compactMap을 사용하면 좋을 것 같다.
