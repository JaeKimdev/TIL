"use strict";

// Array

// 1. Declaration
const arr1 = new Array();
const arr2 = [1, 2];

// 2. index position
const fruits = ["apple", "banana"];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits.length - 1);

// 3. Looping over an array
// a. for loop
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}
// b. for of
for (let fruit of fruits) {
  console.log(fruit);
}
// c. for each
fruits.forEach(function (value, index) {
  console.log(`index : ${index}, value : ${value}`);
});
// or
fruits.forEach((value, index) =>
  console.log(`index : ${index}, value : ${value}`)
);

// 4. Addition, Deleltion, Copy

// push : add an item to the end
fruits.push("orange", "watermelon");
console.log(fruits); // [ 'apple', 'banana', 'orange', 'watermelon' ]

// pop : remove an item from the end
fruits.pop();
fruits.pop();
console.log(fruits);

// unshift : add an item to the beginning
fruits.unshift("lemon");
console.log(fruits); // [ 'lemon', 'apple', 'banana']

// shift : remove an item to the beginning
fruits.shift();
console.log(fruits); // [ 'apple', 'banana']

// note!!! shift, unshift : much slower than pop, push

// splice : remove an item by index position
fruits.push("orange", "watermelon");
console.log(fruits); // ['apple', 'banana', 'orange', 'watermelon']
fruits.splice(1, 1);
console.log(fruits); // ['apple', 'orange', 'watermelon']
fruits.splice(1, 0, "tomato", "Greek");
console.log(fruits); // ['apple', 'tomato', 'Greek', 'orange', 'watermelon']

// conbine two arrays
const fruits2 = ["pear", "gimbab"];
const newFruits = fruits.concat(fruits2);
console.log(newFruits); // ['apple', 'tomato', 'Greek', 'orange', 'watermelon', 'pear', 'gimbab']

// 5. Searching

// indexOf : find the index
console.log(fruits);
console.log(fruits.indexOf("apple")); // 0
console.log(fruits.indexOf("Greek")); // 2
console.log(fruits.indexOf("pizza")); // -1

// includes
console.log(fruits.includes("Greek")); // true
console.log(fruits.includes("pizza")); // false

// lastIndexOf
console.log(fruits);
fruits.push("apple");
console.log(fruits);
console.log(fruits.indexOf("apple")); // 0
console.log(fruits.lastIndexOf("apple")); // 5
