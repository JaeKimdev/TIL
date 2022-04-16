"use strict";
// Objects
// one of the JavaScript's data types
// a collection of related data and/or functionality
// Nearly all objects in JavaScript are instances of Object
// Object = {key : value};

// 1. Literals and Properties
// before use object
const fullname = "jae";
const age = 4;
print(fullname, age);
function print(name, age) {
  console.log(name);
  console.log(age);
}

// after use object
// function이 object를 입력받고 object의 속성을 사용
const jae = { name: "jae", age: 4 };

function print_another(person) {
  console.log(person.name);
  console.log(person.age);
}
print_another(jae);

// How to make object
const obj1 = {}; // 'object literal' syntax (class를 안만들어도 바로 생성 가능)
const obj2 = new Object(); // 'object constructor' syntax

// with JavaScript magic (dynamically typed language)
// can add properties later
jae.hasJob = true;
console.log(jae.hasJob);

// can delete properties later
delete jae.hasJob;
console.log(jae.hasJob); //undefined

// 2. Compute Properties
// key should be always string

console.log(jae.name); // jae
console.log(jae["name"]); // jae
jae["hasJob"] = true;
console.log(jae.hasJob); // true

// function에서 obj를 받아서 속성값을 다루고 싶을 때!
function printValue(obj, key) {
  console.log(obj.key); // undefined 이렇게 하면 값을 못 받아온다. 그냥 obj 자체에 key가 있냐를 물어보니 undefined
  console.log(obj[key]);
}
printValue(jae, "name"); // jae
printValue(jae, "age"); // 4

// 3. Property value shorthand - object를 생성하는게 일일히 귀찮을 때 Property value shorthand를 사용

const person1 = { name: "bob", age: 2 };
const person2 = { name: "stave", age: 3 };
const person3 = { name: "dave", age: 4 };

const person4 = makePerson("jae", 20);
const person5 = new Person("yoo", 100);
console.log(person4);

function makePerson(name, age) {
  return {
    name,
    age,
  };
}

// 4. Constructor Function
function Person(name, age) {
  // this = {};
  this.name = name;
  this.age = age;
  // return this;
}

// 5. in operator : property existence check (key in obj)
// obj 안에 속성값, key가 있는지 확인한다.
console.log("name" in jae); // true
console.log("age" in jae); // true
console.log("random" in jae); // false
console.log(jae.random); // undefined

// 6. for..in vs for..of
// for (key in obj)
for (let key in jae) {
  console.log(key);
}

// for (value of iterable)
const array = [1, 2, 3, 4, 5];

for (let i = 0; i < array.length; i++) {
  console.log(array[i]);
}
// same as above
for (let value of array) {
  console.log(value);
}

// 7. fun cloning
// Object.assign(dest, [obj1, obj2, obj3])

const user = { name: "jae", age: "20" };
const user2 = user;
user2.name = "coder";
console.log(user); // {name: 'coder', age:'20'};

// same as above - old way
const user3 = {};
for (let key in user) {
  user3[key] = user[key];
}
console.log(user3);

// same as above - new way
const user4 = {};
Object.assign(user4, user);
console.log(user4);
// or
const user5 = Object.assign({}, user);
console.log(user5);

// Another assign Example
const fruit1 = { color: "red" };
const fruit2 = { color: "blue", size: "big" };
// fruit1, 2 를 거치면서 뒤에갈수록 계속 앞에 덮어씌운다.
const mixed = Object.assign({}, fruit1, fruit2);
console.log(mixed.color); // blue
console.log(mixed.size); // big

const fruit3 = { color: "black", size: "mid" };
// fruit3, 4 를 거치면서 뒤에갈수록 계속 앞에 덮어씌운다.
const mixed_2 = Object.assign({}, fruit2, fruit3);
console.log(mixed_2.color); // black
console.log(mixed_2.size); // mid
