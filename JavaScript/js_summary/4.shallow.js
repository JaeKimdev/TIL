// Shallow Copy - 얕은 복사 : 객체는 메모리 주소 전달
// 자바스크립트에서 복사할때는 항상 얕은 복사가 이루어짐
// Array.from, concat, slice, spread(...), Object.assign
const pizza = { name: "Pepperoni", price: 2, owner: { name: "Jae" } };
const ramen = { name: "Chicken", price: 3 };
const sushi = { name: "Salmon", price: 1 };
const store1 = [pizza, ramen];
const store2 = Array.from(store1);
console.log("Store 1 : ", store1);
console.log("Store 2 : ", store2);

store2.push(sushi);
console.log("Store 1 : ", store1);
console.log("Store 2 : ", store2);

pizza.price = 4;
console.log("Store 1 : ", store1);
console.log("Store 2 : ", store2);
