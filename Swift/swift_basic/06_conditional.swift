//
//  main.swift
//  SS_Week1
//
//  Created by smfc on 29/6/2022.
//

import Foundation

//MARK: if-else
let someInteger = 100

if someInteger < 100 {
    print("100 미만")
} else if someInteger > 100 {
    print("100 초과")
} else {
    print("100")
} // 100

// if someInteger { } // same as if 100 { }
// 스위프트의 조건에는 항상 Bool 타입이 들어와야합니다
// someInteger는 Bool 타입이 아닌 Int 타입이기 때문에 컴파일 오류가 발생합니다

//MARK: switch
// 범위 연산자를 활용하면 더욱 쉽고 유용합니다
switch someInteger {
case 0:
    print("zero")
case 1..<100:
    print("1~99")
case 100:
    print("100")
case 101...Int.max:
    print("over 100")
default:
    print("unknown")
} // 100

// 정수 외의 대부분의 기본 타입을 사용할 수 있습니다
switch "jae" {
case "jake":
    print("jake")
case "mina":
    print("mina")
case "jae":
    print("jae!!")
default:
    print("unknown")
} // jae!!


