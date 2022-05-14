// Equality operator (동등 비교 관계 연산자)
// ==
// !=
// === (strict equality) 값과 타입이 둘다 같음
// !== (strict inequality) 값과 타입이 둘다 다를 때

console.log(2 == 2);
console.log(2 != 2);
console.log(2 != 3);
console.log(2 == 3);
console.log(2 == "2");
console.log(2 === "2"); //✨
console.log(true == 1);
console.log(true === 1);
console.log(false == 0);
console.log(false === 0);
console.clear();

const obj1 = {
  name: "John",
};
const obj2 = {
  name: "John",
};

console.log(obj1 == obj2);
console.log(obj1 === obj2);
console.log(obj1.name == obj2.name);
console.log(obj1.name === obj2.name);

let obj3 = obj2;
console.log(obj3 == obj2);
console.log(obj3 === obj2);
