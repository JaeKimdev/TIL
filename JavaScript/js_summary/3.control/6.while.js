// While loop

let num = 5;
while (num >= 0) {
  console.log(num);
  num--;
}

let isActive = false;
let i = 0;
while (isActive) {
  console.log("It's live!");
  if (i === 10) {
    break;
  }
  i++;
}

do {
  console.log("Do-While : It's live!");
} while (isActive);
