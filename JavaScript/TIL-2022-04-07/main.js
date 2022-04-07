// 1. Use strict
// Added in ES 5
// use this for Vanila JavaScript
`use strict`;

// 2. Variable
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

// 3. Constants
// favor immutable data type always for a few reasons
// - security
// - thread safty
// - reduce human mistakes
const daysInWeek = 7;
const maxNumber = 5;

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
