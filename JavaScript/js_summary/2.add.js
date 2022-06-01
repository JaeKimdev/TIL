const fruits = ["apple", "banana", "orange"];

// 배열 아이템을 참조하는 방법
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);
console.log(fruits.length);

for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

// 추가, 삭제 - Bad example
fruits[3] = "grape";
console.log(fruits);
fruits[6] = "strawberry";
console.log(fruits);

delete fruits[1];
console.log(fruits);
