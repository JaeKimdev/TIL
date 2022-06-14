# 컬렉션 타입

- Array
- Dictionary
- Set

|    타입    |                 설명                 |
| :--------: | :----------------------------------: |
|   Array    |      순서가 있는 리스트 컬렉션       |
| Dictionary | `키`와 `값`의 쌍으로 이루어진 컬렉션 |
|    Set     |  순서가 없고, 멤버가 유일한 컬렉션   |

## # Array

> Array는 멤버가 순서(인덱스)를 가진 리스트 형태의 컬렉션 타입입니다.

```Swift
// 빈 Int Array 생성
var integers: Array<Int> = Array<Int>()

// 같은 표현
// var integers: Array<Int> = [Int]()
// var integers: Array<Int> = []
// var integers: [Int] = Array<Int>()
// var integers: [Int] = [Int]()
// var integers: [Int] = []
// var integers = [Int]()
```

> Array 활용

```Swift
integers.append(1)
integers.append(100)

// Int 타입이 아니므로 Array에 추가할 수 없습니다
//integers.append(101.1)

print(integers)	// [1, 100]

// 멤버 포함 여부 확인
print(integers.contains(100)) // true
print(integers.contains(99)) // false

// 멤버 교체
integers[0] = 99

// 멤버 삭제
integers.remove(at: 0)
integers.removeLast()
integers.removeAll()

// 멤버 수 확인
print(integers.count)

// 인덱스를 벗어나 접근하려면 익셉션 런타임 오류발생
//integers[0]
```

> `let`을 사용하여 Array를 선언하면 불변 Array가 됩니다

```Swift
let immutableArray = [1, 2, 3]

// 수정이 불가능한 Array이므로 멤버를 추가하거나 삭제할 수 없습니다
//immutableArray.append(4)
//immutableArray.removeAll()
```

## # Dictionary

```Swift
// Key가 String 타입이고 Value가 Any인 빈 Dictionary 생성
var anyDictionary: Dictionary<String, Any> = [String: Any]()
anyDictionary["someKey"] = "value"
anyDictionary["anotherKey"] = 100
print(anyDictionary) // ["someKey": "value", "anotherKey": 100]

// Key에 해당하는 값 변경
anyDictionary["someKey"] = "dictionary"
print(anyDictionary) // ["someKey": "dictionary", "anotherKey": 100]

// Key에 해당하는 값 제거
anyDictionary.removeValue(forKey: "anotherKey")
anyDictionary["someKey"] = nil
print(anyDictionary) // [:]

// 빈 Dictionary 생성
let emptyDictionary: [String: String] = [:]

// 초기 값을 가지는 Dictionary 생성
let initalizedDictionary: [String: String] = ["name": "jae", "gender": "male"]

// let으로 선언한 불변 Dictionary는 수정 불가 - 컴파일 오류 발생
//emptyDictionary["key"] = "value"

// name 키에 해당하는 값이 Dictionary에 존재하지 않을 수 있으므로
// 컴파일 오류 발생 - 옵셔널 파트에서 상세히 다룹니다
//let someValue: String = initalizedDictionary["name"]
```

## # Set

```Swift
// 빈 Int Set 생성 - Set는 축약 문법이 없다!
var integerSet: Set<Int> = Set<Int>()
integerSet.insert(1)
integerSet.insert(100)
integerSet.insert(99)
// Set는 중복된 값이 없음을 보장해줌으로 아무리 많이 동일한 99 값을 넣어줘도 한번만 입력
integerSet.insert(99)
integerSet.insert(99)

print(integerSet) // [100, 99, 1]

print(integerSet.contains(1)) // true
print(integerSet.contains(2)) // false

integerSet.remove(100)
integerSet.removeFirst()

print(integerSet.count) // 1

// Set는 집합 연산에 꽤 유용합니다
let setA: Set<Int> = [1, 2, 3, 4, 5]
let setB: Set<Int> = [3, 4, 5, 6, 7]

// 합집합 - union method 사용
let union: Set<Int> = setA.union(setB)
print(union) // [2, 4, 5, 6, 7, 3, 1]

// 합집합 - union이라는 set는 순서도 없고 인덱스도 없어서
// sorted 메소드를 이용하여 배열로 정렬해줌.
let sortedUnion: [Int] = union.sorted()
print(sortedUnion) // [1, 2, 3, 4, 5, 6, 7]

// 교집합
let intersection: Set<Int> = setA.intersection(setB)
print(intersection) // [5, 3, 4]

// 차집합
let subtracting: Set<Int> = setA.subtracting(setB)
print(subtracting) // [2, 1]
```

## Reference

[Apple Developer - Array](https://developer.apple.com/documentation/swift/array)  
[Apple Developer - Dictionary](https://developer.apple.com/documentation/swift/dictionary)  
[Apple Developer - Set](https://developer.apple.com/documentation/swift/set)
