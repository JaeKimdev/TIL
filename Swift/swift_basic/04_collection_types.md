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

> let을 사용하여 Array를 선언하면 불변 Array가 됩니다

```Swift
let immutableArray = [1, 2, 3]

// 수정이 불가능한 Array이므로 멤버를 추가하거나 삭제할 수 없습니다
//immutableArray.append(4)
//immutableArray.removeAll()
```
