//
//  main.swift
//  SS_Week1
//
//  Created by smfc on 30/6/2022.
//

import Foundation

//MARK: Implicitly Unwrapped Optional - 암시적 추출 옵셔널(!사용)

//var optionalValue: Int! = 100
//
//switch optionalValue {
//case .none:
//    print("This Optional variable is nil")
//case .some(let value):
//    print("Value is \(value)")
//}

// 기존 변수처럼 사용 가능
//optionalValue = optionalValue + 1

// nil 할당 가능
//optionalValue = nil

// 잘못된 접근으로 인한 런타임 오류 발생
//optionalValue = optionalValue + 1

//MARK: Optional - 옵셔널(?사용)

var optionalValue: Int? = 100

switch optionalValue {
case .none:
    print("This Optional variable is nil")
case .some(let value):
    print("Value is \(value)")
}

// nil 할당 가능
optionalValue = nil

// 기존 변수처럼 사용불가 - 옵셔널과 일반 값은 다른 타입이므로 연산불가
//optionalValue = optionalValue + 1

//MARK: Optional Unwapping - 옵셔널의 값을 꺼내오는 방법

//MARK: Optional Binding - 옵셔널 바인딩(nil체크 + 안전한 값 추출)

//func printName(_ name: String) {
//    print(name)
//}
//
//var myName: String? = nil

// printName(myName) // 전달되는 값의 타입이 다르기 때문에 컴파일 오류발생

// # If-let 방식으로 바인딩
func printName(_ name: String) {
    print(name)
}

var myName: String! = nil

if let name: String = myName {
    printName(name)
} else {
    print("myName == nil")
}

// name 상수는 if-let 구문 내에서만 사용가능합니다
// printName(name) // 상수 사용범위를 벗어났기 때문에 컴파일 오류 발생


// ,를 사용해 한 번에 여러 옵셔널을 바인딩 할 수 있습니다
// 모든 옵셔널에 값이 있을 때만 동작합니다 - 이 예제에서는 myName과 yourName
// var myName: String? = "jae"
var yourName: String? = nil

if let name = myName, let friend = yourName {
    print("\(name) and \(friend)") // yourName이 nil이기 때문에 실행되지 않습니다
}

yourName = "hana"

if let name = myName, let friend = yourName {
    print("\(name) and \(friend)")
}
// jae and hana

//MARK: Force Unwrapping - 강제 추출(그다지 추천되는 방식은 아님-보통 바인딩을 사용)

//func printName(_ name: String) {
//    print(name)
//}
//
//var myName: String? = "jae"
//
//printName(myName!) // !를 사용해서 옵셔널 타입이 아닌 스트링 타입으로 값을 강제로 추출한다 - jae
//
//myName = nil
//
//print(myName!) // nil값이 전달되기 때문에 런타임 오류 발생
//
//var yourName: String! = nil
//
//printName(yourName) // nil 값이 전달되기 때문에 런타임 오류발생

//let date = Date()
//let calendar = Calendar.current
//let day = calendar.component(.day, from: date)
//let hour = calendar.component(.hour, from: date)
//let minutes = calendar.component(.minute, from: date)

func day(of: Date) -> Int {
    let date = of
    let calendar = Calendar.current
    let today = calendar.component(.day, from: date)
    return today
}

let today = Date()
var someDictionary: [String: String] = [:]
let day: Int = day(of: today)

if day == 1 || day == 30 {
    someDictionary["날씨"] = "맑음"
} else {
    someDictionary["풍향"] = "남동풍"
}

// 이 시점에 "날씨" 키에 해당하는 값이 항상 존재한다고 장담할 수 있을까요?
if let weather :String = someDictionary["날씨"] {
    print(weather)
}
else {
    print("날씨 is nil")
}

if let windDirection :String = someDictionary["풍향"] {
    print(windDirection)
}
else {
    print("풍향 is nil")
}

var numbers: [Int?] = [0, 1, nil, 2, 5]
numbers.append(nil)

let someArray: [[[Int?]?]?] = [[[1, 2], nil, [3, nil, 4], nil, [5, 6]]]

if let firstInnerArray: [[Int?]?] = someArray[0] {
        print("First inner array is: \(firstInnerArray)")
    if let secondInnerArray: [Int?] = firstInnerArray[2] {
        print("Second inner array is: \(secondInnerArray)")
        if let unWrappedGoalNumber: Int = secondInnerArray[0] {
                print(unWrappedGoalNumber)
        }
    }
}

