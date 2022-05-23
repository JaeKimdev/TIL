// Object literal {key: value}
// new Object()
// Object.create()
// key - 문자, 숫자, 문자열, 심볼
// value - 원시값, 객체 (함수)

let apple = {
  name: "Apple",
  hello: "🖐",
  0: 1,
  ["hello-bye"]: "bye",
};

// 속성, 데이터에 접근하기 위해서는
apple.name; // dot notation 마침표 표기법
console.log(apple["hello-bye"]); // braket notation 대괄호 표기법
apple["name"];

// 속성 추가
apple.emoji = "🍎";
console.log(apple.emoji);
console.log(apple["emoji"]);

// 속성 삭제
delete apple.emoji;
console.log(apple);
