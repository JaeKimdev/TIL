const title = document.querySelector(".content_title");
const range = document.querySelector(".content_range-select");
const input_guess = document.querySelector(".content_input-guess");
const btn_guess = document.querySelector(".content_btn-guess");
const descValue = document.querySelector(".content_desc-value");
const result = document.querySelector(".content_result");

let maxValue = 50;

function generateRandomValue() {
  const randomValue = Math.round(Math.random() * maxValue);
  return randomValue;
}

function compareValues(humanValue, machineValue) {
  return humanValue == machineValue ? "You won!" : "You lost!";
}

function handleRange(event) {
  maxValue = event.target.value;
  title.innerText = `Generate a number between 0 and ${maxValue}`;
}

function handleSubmit(event) {
  event.preventDefault();
  const guessValue = input_guess.value;

  if (guessValue === "" || guessValue < 0) {
    alert("Please input plus value!!");
    return;
  }

  const randomValue = generateRandomValue();

  descValue.innerText = `You chose: ${guessValue}, the machine chose: ${randomValue}`;
  result.innerText = compareValues(guessValue, randomValue);
}

range.addEventListener("input", handleRange);
btn_guess.addEventListener("click", handleSubmit);
