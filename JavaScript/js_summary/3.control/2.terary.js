// Ternary operator
let fruit = "apple";
if (fruit === "apple") {
  console.log("apple");
} else if (fruit === "banana") {
  console.log("banana");
} else {
  console.log("other");
}
fruit === "apple" ? console.log("apple") : console.log("other");

let emoji = fruit === "apple" ? "🍎" : "😃";
console.log(emoji);
