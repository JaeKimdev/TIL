import Foundation

// 상수, 변수의 선언
// 상수 선언 키워드 let
// 변수 선언 키워드 var

// 상수의 선언
// let 이름: 타입 = 값

// 변수의 선언
// var 이름: 타입 = 값

// 값의 타입이 명확하다면 타입은 생략 가능
// let 이름 = 값
// var 이름 = 값

let constant: String = "mutable name let"
var variable: String = "immutable name var"

variable = "Can change later"
// constant = "Cannot change" // error

let sum: Int
let inputA: Int = 100
let inputB: Int = 200

// 선언 후 첫 할당
sum = inputA + inputB

// sum = 1 // error 한번 선언 후에는 다시 값을 바꿀 수 없다

// 변수도 나중에 할당하는 것이 가능
var nickName: String

nickName = "mene"

// 생각해 보기
//let name = "Jae"
var numberToAdd = 5
let pi = 3.14195
let maxItemCount = 1000


// 스스로 해보기
var name = "길동"
doSwing(name: name)

name = "춘향"
doSwing(name: name)

func doSwing(name: String) {
    for count in 1...3 {
        print("\(name)이 \(count) 번째 폴짝!")
    }
}
