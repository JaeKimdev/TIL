const fruits = ["🍌", "🍓", "🍇", "🍓"];
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

// 배열을 빙글빙글 돌면서 콜백함수 호출
fruits.forEach(function (value) {
  console.log(value);
});

fruits.forEach((value) => console.log(value));

// 조건에 맞는(콜백함수) 아이템을 찾을 때
// find: 제일 먼저 조건에 맞는 아이템을 반환
const item1 = { name: "pizza", price: 2 };
const item2 = { name: "ice cream", price: 3 };
const item3 = { name: "cake", price: 1 };
const products = [item1, item2, item3, item2];
let result = products.find((value) => value.name === "ice cream");
console.log(result);

// findIndex: 제일 먼저 조건에 맞는 아이템의 인덱스를 반환
result = products.findIndex((value) => value.name === "ice cream");
console.log(result);

// 배열의 아이템들이 부분적으로 조건(콜백함수)에 맞는지 확인
result = products.some((item) => item.name === "pizza");
console.log(result);

// 배열의 아이템들이 전부 조건(콜백함수)에 맞는지 확인
result = products.every((item) => item.name === "pizza");
console.log(result);

// 조건에 맞는 모든 아이템들을 새로운 배열로!
result = products.filter((item) => item.name === "ice cream");
console.log(result);

console.clear();

// Map: 배열의 아이템들을 새로운 배열로 반환
const numbers = [1, 2, 3, 4, 5];
result = numbers.map((number) => number * 2);
console.log(result);
result = numbers.map((number) => {
  if (number % 2 === 0) {
    return number * 2;
  } else {
    return number;
  }
});
console.log(result);

// Flatmap: 중첩된 배열을 하나의 배열로 쫙 펴줌
result = numbers.map((item) => [1, 2]);
console.log(result);

result = numbers.flatMap((item) => [1, 2]);
console.log(result);

result = ["Jae", "Coder"].map((text) => text.split(""));
console.log(result); // [ [ 'J', 'a', 'e' ], [ 'C', 'o', 'd', 'e', 'r' ] ]

result = ["Jae", "Coder"].flatMap((text) => text.split(""));
console.log(result); // [ 'J', 'a', 'e', 'C', 'o', 'd', 'e', 'r' ]

// sort: 배열의 아이템들을 정렬
// 문자열 형태의 오름차순으로 요소를 정렬하고, 기존의 배열을 변경
const texts = ["hi", "abc"];
texts.sort();
console.log(texts); // [ 'abc', 'hi' ]

const numbers2 = [0, 5, 4, 2, 1, 10];
numbers2.sort();
console.log(numbers2); // [ 0, 1, 10, 2, 4, 5 ] - 문자열 형태로 변환되기 때문에 1 다음에 10이 나옴
// < 0 : a가 b보다 앞으로 정렬, 오름차순
// > 0 : a가 b보다 뒤로 정렬, 내림차순
numbers2.sort((a, b) => a - b);
console.log(numbers2); // [ 0, 1, 2, 4, 5, 10 ] - 숫자 형태로 변환되기 때문에 숫자들이 정렬됨

// reduce: 배열의 요소들을 접어서 접어서 값을 하나로 만들어줌
result = [1, 2, 3, 4, 5].reduce((sum, value) => {
  sum += value;
  return sum;
}, 0);

// 값을 계속해서 저장해 줄 sum이라는 인자를 설정하고 초기값으로 0을 지정, value라는 인자에 각각의 요소들이 순차적으로 할당되어 다 더해줌
result = [1, 2, 3, 4, 5].reduce((sum, value) => sum + value, 0);

console.log(result); // 15
