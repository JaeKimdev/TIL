// Copy by value (Primitive Type) 원시타입은 값이 복사되어 전달됨
let a = 1;
let b = a;
b = 2;
console.log(a);
console.log(b);

// Copy by reference (Object Type) 객체는 참조가 복사되어 전달됨
let apple = {
  name: "apple",
};
let orange = apple;
orange.name = "orange";
console.log(apple);
console.log(orange);
