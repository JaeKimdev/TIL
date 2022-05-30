// 퀴즈
// 1. 문자열의 모든 케릭터를 하나씩 출력하라
const text = "Hello World";
// H
// e
// l
// ..
// d

for (let i = 0; i < text.length; i++) {
  console.log(text[i]);
}

// 2. 사용자들의 id를 잘라내어 각각의 id를 배열로 보관
const ids = "user1, user2, user3, user4";
// [ 'user1', 'user2', 'user3', 'user4' ]

const id = ids.split(", ");
console.log(id);

// 3. 1초에 한번씩 시계를 (날짜 포함) 출력하라
// setInterval

setInterval(() => {
  const now = new Date();
  console.log(now.toLocaleString("en-AU"));
}, 1000);
