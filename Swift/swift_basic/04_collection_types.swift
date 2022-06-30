//
//  swift.swift
//  SS_Week1
//
//  Created by smfc on 27/6/2022.
//

import Foundation

 /* 컬렉션 타입 */
// Array, Dictionary, Set

/*
 Array - 순서가 있는 리스트 컬렉션
 Dictionary - 키와 값의 쌍으로 이루어진 컬렉션
 Set - 순서가 없고, 멤버가 유일한 컬렉션
*/

//MARK: - Array

// 빈 Int Array 생성
var integers: Array<Int> = Array<Int>()

// 같은 표현
// var integers: Array<Int> = [Int]()
// var integers: Array<Int> = []
// var integers: [Int] = Array<Int>()
// var integers: [Int] = [Int]()
// var integers: [Int] = []
// var integers = [Int]()

integers.append(1)
integers.append(100)

// integers.append(101.1) Int 타입이 아니므로 Array에 추가할 수 없습니다

print(integers)    // [1, 100]

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

// integers[0] 인덱스를 벗어나 접근하려면 익셉션 런타임 오류발생

// Array<Double>와 [Double]는 동일한 표현
// 빈 Double Array 생성
var doubles: Array<Double> = [Double]()

// 빈 String Array 생성
var strings: [String] = [String]()

// 빈 Character Array 생성
// []는 새로운 빈 Array
var characters: [Character] = []

// let을 사용하여 Array를 선언하면 불변 Array가 됩니다.
let immutableArray = [1, 2, 3]

// 불변 Array의 요소는 추가/삭제 불가 - 컴파일 오류 발생
//immutableArray.append(4)
//immutableArray.removeAll()

//MARK: Dictionary

// Key가 String 타입이고 Value가 Any인 빈 Dictionary 생성
var anyDictionary: Dictionary<String, Any> = [String: Any]()

// 같은 표현
// var anyDictionary: Dictionary<String, Any> = Dictionary<String, Any>()
// var anyDictionary: Dictionary<String, Any> = [:]
// var anyDictionary: [String: Any] = Dictionary<String, Any>()
// var anyDictionary: [String: Any] = [String: Any]()
// var anyDictionary: [String: Any] = [:]
// var anyDictionary = [String: Any]()

x
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

// emptyDictionary["key"] = "value"
// let으로 선언한 불변 Dictionary는 수정 불가 - 컴파일 오류 발생

// let someValue: String = initalizedDictionary["name"]
// name 키에 해당하는 값이 없을 수 있으므로 String 타입의 값이 나올 것이라는 보장이 없습니다.
// 컴파일 오류 발생 - 옵셔널 파트에서 상세히 다룹니다

// MARK: Set

// 빈 Int Set 생성
var integerSet: Set<Int> = Set<Int>() // 축약 문법이 없음
integerSet.insert(1)
integerSet.insert(100)
integerSet.insert(99)
integerSet.insert(99) // set는 중복된 값이 없다!
integerSet.insert(99)

print(integerSet) // [100, 99, 1]
print(integerSet.contains(1)) // true
print(integerSet.contains(2)) // false
integerSet.remove(100)
integerSet.removeFirst()

print(integerSet.count) // 1

// Set는 집합 연산에 꽤 유용합니다
let setA: Set<Int> = [1, 2, 3, 4, 5] // {5, 2, 3, 1, 4}
let setB: Set<Int> = [3, 4, 5, 6, 7] // {5, 6, 7, 3, 4}

// 합집합
let union: Set<Int> = setA.union(setB)
print(union) // {2, 4, 5, 6, 7, 3, 1}
// set는 자동으로 정렬이 되지도 않고, 인덱스 값도 없기 때문에, sorted를 이용해서 합집합 오름차순 정렬하면 같은 타입의 배열로 변환됨
let sortedUnion: [Int] = union.sorted()
print(sortedUnion) // [1, 2, 3, 4, 5, 6, 7]
// 교집합
let intersection: Set<Int> = setA.intersection(setB)
print(intersection) // {5, 3, 4}
// 차집합
let subtracting: Set<Int> = setA.subtracting(setB)
print(subtracting) // {2, 1}

