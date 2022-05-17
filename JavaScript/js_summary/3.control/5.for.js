// Loop Statement: for

for (let i = 0; i < 5; i++) {
  console.log(i);
}

for (let i = 0; i < 5; i++) {
  for (let j = 0; j < 5; j++) {
    console.log(i, j);
  }
}

// Infinite Loop
// for (;;) {
//   console.log("😝");
// }

// Break Statement: continue, break
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    console.log("5 is found");
    break;
  }
  console.log(i);
}

for (let i = 0; i < 10; i++) {
  if (i === 5) {
    console.log("5 is found");
    continue;
    break;
  }
  console.log(i);
}
