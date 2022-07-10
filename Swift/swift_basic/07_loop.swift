import Foundation

func printMuYaHo(maxNum: Int) {
    for count in 0...maxNum {
        print(count, "번째 무야호")
    }
}

// printMuYaHo(maxNum: 5)

func gugu(number: Int) {
    for count in 1...9 {
        print(number, " X \(count) = ", number * count)
    }
}

// gugu(number: 3)

print(1, 2, 3) // 1 2 3
print(1, 2, 3, separator: "!") // 1!2!3!
print(1, 2, 3, separator: "") // 123
print(1...5) // 1...5

//print 함수는 기본적으로 줄바꿈 되어 출력됨
print("내가 좋아하는 계절 : ")
print("봄")

// 줄바꿈을 하지 않기 위해서는 terminator 매개변수에 원하는 인자를 전달
print("내가 좋아하는 계절", terminator: " : ")
print("봄")

// seperator와 terminator 매개변수는 동시에 사용하거나 아예 사용하지 않을 수 있다
// 단, 동시에 사용할 때는 seperator가 terminator보다 먼저 위치해야 함
print("내가 좋아하는 숫자", terminator: " : ")
print(1, 2, 3, separator: ", ", terminator: " 모두!")
print()

//MARK: for-in

var integers = [1, 2, 3]
let people = ["jae": 10, "eric": 15, "mike": 12]

// for - in 구문의 사용
for integer in integers {
    print(integer)
}

// Dictionary의 item은 key와 value로 구성된 튜플 타입입니다
for (name, age) in people {
    print("\(name): \(age)")
}

//MARK: while

while condition {
    /* code */
}

// while의 컨디션은 항상 true/false값이 들어와야 한다
while integers.count > 1 {
    integers.removeLast()
}

//MARK: repeat-while

repeat {
    /* code */
} while condition

repeat {
    integers.removeLast()
} while integers.count > 0
