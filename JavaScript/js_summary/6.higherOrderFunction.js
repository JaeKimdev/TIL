const fruits = ["π", "π", "π", "π"];
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

// λ°°μ΄μ λΉκΈλΉκΈ λλ©΄μ μ½λ°±ν¨μ νΈμΆ
fruits.forEach(function (value) {
  console.log(value);
});

fruits.forEach((value) => console.log(value));

// μ‘°κ±΄μ λ§λ(μ½λ°±ν¨μ) μμ΄νμ μ°Ύμ λ
// find: μ μΌ λ¨Όμ  μ‘°κ±΄μ λ§λ μμ΄νμ λ°ν
const item1 = { name: "pizza", price: 2 };
const item2 = { name: "ice cream", price: 3 };
const item3 = { name: "cake", price: 1 };
const products = [item1, item2, item3, item2];
let result = products.find((value) => value.name === "ice cream");
console.log(result);

// findIndex: μ μΌ λ¨Όμ  μ‘°κ±΄μ λ§λ μμ΄νμ μΈλ±μ€λ₯Ό λ°ν
result = products.findIndex((value) => value.name === "ice cream");
console.log(result);

// λ°°μ΄μ μμ΄νλ€μ΄ λΆλΆμ μΌλ‘ μ‘°κ±΄(μ½λ°±ν¨μ)μ λ§λμ§ νμΈ
result = products.some((item) => item.name === "pizza");
console.log(result);

// λ°°μ΄μ μμ΄νλ€μ΄ μ λΆ μ‘°κ±΄(μ½λ°±ν¨μ)μ λ§λμ§ νμΈ
result = products.every((item) => item.name === "pizza");
console.log(result);

// μ‘°κ±΄μ λ§λ λͺ¨λ  μμ΄νλ€μ μλ‘μ΄ λ°°μ΄λ‘!
result = products.filter((item) => item.name === "ice cream");
console.log(result);

console.clear();

// Map: λ°°μ΄μ μμ΄νλ€μ μλ‘μ΄ λ°°μ΄λ‘ λ°ν
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

// Flatmap: μ€μ²©λ λ°°μ΄μ νλμ λ°°μ΄λ‘ μ« ν΄μ€
result = numbers.map((item) => [1, 2]);
console.log(result);

result = numbers.flatMap((item) => [1, 2]);
console.log(result);

result = ["Jae", "Coder"].map((text) => text.split(""));
console.log(result); // [ [ 'J', 'a', 'e' ], [ 'C', 'o', 'd', 'e', 'r' ] ]

result = ["Jae", "Coder"].flatMap((text) => text.split(""));
console.log(result); // [ 'J', 'a', 'e', 'C', 'o', 'd', 'e', 'r' ]

// sort: λ°°μ΄μ μμ΄νλ€μ μ λ ¬
// λ¬Έμμ΄ ννμ μ€λ¦μ°¨μμΌλ‘ μμλ₯Ό μ λ ¬νκ³ , κΈ°μ‘΄μ λ°°μ΄μ λ³κ²½
const texts = ["hi", "abc"];
texts.sort();
console.log(texts); // [ 'abc', 'hi' ]

const numbers2 = [0, 5, 4, 2, 1, 10];
numbers2.sort();
console.log(numbers2); // [ 0, 1, 10, 2, 4, 5 ] - λ¬Έμμ΄ ννλ‘ λ³νλκΈ° λλ¬Έμ 1 λ€μμ 10μ΄ λμ΄
// < 0 : aκ° bλ³΄λ€ μμΌλ‘ μ λ ¬, μ€λ¦μ°¨μ
// > 0 : aκ° bλ³΄λ€ λ€λ‘ μ λ ¬, λ΄λ¦Όμ°¨μ
numbers2.sort((a, b) => a - b);
console.log(numbers2); // [ 0, 1, 2, 4, 5, 10 ] - μ«μ ννλ‘ λ³νλκΈ° λλ¬Έμ μ«μλ€μ΄ μ λ ¬λ¨

// reduce: λ°°μ΄μ μμλ€μ μ μ΄μ μ μ΄μ κ°μ νλλ‘ λ§λ€μ΄μ€
result = [1, 2, 3, 4, 5].reduce((sum, value) => {
  sum += value;
  return sum;
}, 0);

// κ°μ κ³μν΄μ μ μ₯ν΄ μ€ sumμ΄λΌλ μΈμλ₯Ό μ€μ νκ³  μ΄κΈ°κ°μΌλ‘ 0μ μ§μ , valueλΌλ μΈμμ κ°κ°μ μμλ€μ΄ μμ°¨μ μΌλ‘ ν λΉλμ΄ λ€ λν΄μ€
result = [1, 2, 3, 4, 5].reduce((sum, value) => sum + value, 0);

console.log(result); // 15
