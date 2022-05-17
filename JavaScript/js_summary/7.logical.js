// Logical Operators
// && - and
// || - or
// ! - not
// !! - double not

let num = 8;
if (num >= 0 && num < 9) {
  console.log("👍");
}

if (num >= 0 || num > 20) {
  console.log("👍👍");
}

if (num != 8) {
  console.log("👍👍👍");
}

console.log(true && true); // true
console.log(true && false); // false
console.log(false && true); // false
console.log(false && false); // false

console.log(true || true); // true
console.log(true || false); // true
console.log(false || true); // true
console.log(false || false); // false

console.log(!"text"); // false
console.log(!!"text"); // true
