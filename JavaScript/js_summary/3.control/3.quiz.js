let num = 2;
// if num is even, then print "even"
// if num is odd, then print "odd"

// if
if (num % 2 === 0) {
  console.log("even๐");
} else {
  console.log("odd๐");
}

// ternary operator
num % 2 === 0 ? console.log("even๐") : console.log("odd๐");

let emoji = num % 2 === 0 ? "๐" : "๐";
console.log(emoji);
