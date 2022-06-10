## # Use Camel Case

- Lower Camel Case : function, method, variable, constant

       ex) someVariableName

- Upper Camel Case : type(class, struct, enum, extension...)

        ex) Person, Point, Week

## # How to pprint consoleLog?

- print

- dump
  > 인스턴스의 상세한 설명(Description 프로퍼티)까지 출력

## # String Interpolation 문자열 보간법

        - 문자열 내에 변수나 상수의 값을 표기하는 방법
        - \()

```Swift
/* ConsoleLog and String Interpolation */

let age: Int = 20

"Hi, I am \(age) years old."

print("Hi, I am \(age + 5) years old.")

class Person {
        var name: String = "Jae"
        var age: Int = 15
}

let jae: Person = Person()

print(jae)

dump(jae)

```
