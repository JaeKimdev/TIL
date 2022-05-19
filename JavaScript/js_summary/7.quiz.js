// 주어진 숫자만큼 0부터 순회하는 함수
// 순회하면서 주어진 특정한 일을 수행해야 함
// 5, 순회하는 숫자를 다 출력하고 싶음
// 5, 순회하는 숫자의 두배값을 다 출력하고 싶음
// function iterate(max, action)

let printAll = (max) => console.log(max);
let printDouble = (max) => console.log(max * 2);

function iterate(max, action) {
  for (let i = 0; i < max + 1; i++) {
    action(i);
  }
}

iterate(5, printAll);
iterate(5, printDouble);

// Callback example
setTimeout(() => console.log("After 3sec, run this Funtion"), 3000);
