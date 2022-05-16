// Conditional Statements - Switch
//
let day = 6;
let dayName;
if (day == 0) {
  dayName = "Sunday";
} else if (day == 1) {
  dayName = "Monday";
} else if (day == 2) {
  dayName = "Tuesday";
} else if (day == 3) {
  dayName = "Wednesday";
} else if (day == 4) {
  dayName = "Thursday";
} else if (day == 5) {
  dayName = "Friday";
} else if (day == 6) {
  dayName = "Saturday";
}

switch (day) {
  case 0:
    dayName = "Sunday";
    break;
  case 1:
    dayName = "Monday";
    break;
  case 2:
    dayName = "Tuesday";
    break;
  case 3:
    dayName = "Wednesday";
    break;
  case 4:
    dayName = "Thursday";
    break;
  case 5:
    dayName = "Friday";
    break;
  case 6:
    dayName = "Saturday";
    break;
  default:
    console.log("Invalid day");
}

console.log(dayName);

let condition = "okay";
let text;
switch (condition) {
  case "okay":
  case "good":
    text = "Good";
    break;
  case "bad":
    text = "Bad";
    break;
}
console.log(text);
