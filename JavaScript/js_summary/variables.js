// 1. Use strict
// Added in ES 5
// use this for Vanila JavaScript
`use strict`;

// 2. Variable, rw(read / write)
// let (added in ES 6)
let globalName = "global name";
{
  let name = "Jae";
  console.log(name);
  name = "hello";
  console.log(name);
  console.log(globalName);
}
console.log(name);
console.log(globalName);

// var (don't ever use this!)
// var hoisting (move declaration from bottom to the top)
// has no block scope
{
  console.log(age);
  age = 5;
  console.log(age);
  var age;
}
console.log(age);

// 3. Constant r(read only)
// use const whenever possible
//only use let if variable needs to change

const daysInWeek = 7;
const maxNumber = 5;

// Immutable data types: primitive data types, frozen objects, (i.e. object.freeze())
// Mutable data types: all objects by default are mutable in JS
// favor immutable data type always for a few reasons
// - security
// - thread safty
// - reduce human mistakes

// 4. Variable types
// primitive types (single item) : string, number, boolean, null, undefined, symbol
// object, box container
// function, first class function (function can be assigned to a variable)

const count = 17; // integer
const size = 17.1; // decimal number
console.log(`value: ${count}, type: ${typeof count}`);
console.log(`value: ${size}, type: ${typeof size}`);

// number - special numeric values: infinity, -infinity, NaN
const infinity = 1 / 0;
const negativeInfinity = -1 / 0;
const nAn = "not a number" / 2;
console.log(infinity);
console.log(negativeInfinity);
console.log(nAn);

// String
const char = "C";
const jae = "Jae";
const greeting = "Hello " + jae;
console.log(`value: ${greeting}, type: ${typeof greeting}`);
const HiName = `Hi ${jae}!`; // template string
console.log(`value: ${HiName}, type: ${typeof HiName}`);

// Boolean
// false: 0, null, undefined, NaN, ""
// true: any other value
const canRead = true;
const test = 3 < 1; // false
console.log(`value: ${canRead}, type: ${typeof canRead}`);
console.log(`value: ${test}, type: ${typeof test}`);

// null
let nothing = null;
console.log(`value: ${nothing}, type: ${typeof nothing}`);

// undefined
let x;
console.log(`value: ${x}, type: ${typeof x}`);

// symbol, create unique identifier for object
const symbol1 = Symbol("id");
const symbol2 = Symbol("id");
console.log(symbol1 === symbol2);
const gSymbol1 = Symbol.for("id");
const gSymbol2 = Symbol.for("id");
console.log(gSymbol1 === gSymbol2); // true
console.log(`value: ${symbol1.description}, type: ${typeof symbol1}`);

// object, real-life object, data structure
const jae = { name: "Jae", age: 20 };
jae.age = 21;

// 5. Dynamic typing: dynamically typed language
let text = "hello";
console.log(text.charAt(0)); // h
console.log(`value: ${text}, type: ${typeof text}`);
text = 1;
console.log(`value: ${text}, type: ${typeof text}`);
text = "7" + 5;
console.log(`value: ${text}, type: ${typeof text}`);
text = "8" / "2";
console.log(`value: ${text}, type: ${typeof text}`);
// console.log(text.charAt(0)); // Error!
