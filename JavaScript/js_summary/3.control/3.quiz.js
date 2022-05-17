let num = 2;
// if num is even, then print "even"
// if num is odd, then print "odd"

// if
if (num % 2 === 0) {
  console.log("even👍");
} else {
  console.log("odd👎");
}

// ternary operator
num % 2 === 0 ? console.log("even👍") : console.log("odd👎");

let emoji = num % 2 === 0 ? "👍" : "👎";
console.log(emoji);
