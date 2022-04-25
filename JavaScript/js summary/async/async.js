// async & await
// clear style of using promise

// 1. async
async function fetchUser() {
  // do network request in 10 secs...
  return "jae";
}

const user = fetchUser();
user.then(console.log);
console.log(user);

// 2. await
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function getApple() {
  await delay(1000);
  return "apple";
}

async function getBanana() {
  await delay(2000);
  return "banana";
}

// same as above
// function getBanana() {
//     await delay(3000)
//     .then(() => "banana");
// }

// function pickFruit() {
//  return getApple().then((apple) => {
//    return getBanana().then((banana) => `${apple} + ${banana}`);
//  });
//}

// same as above

async function pickFruit() {
  const applePromise = getApple(); // promise는 코드를 바로 실행하기 때문에 먼저 선언하고 나중에 await 실행하면 시간을 줄일 수 있다
  const bananaPromise = getBanana();
  const apple = await applePromise;
  const banana = await bananaPromise;
  return `${apple} + ${banana}`;
}

pickFruit().then(console.log);

// 3. useful Promise APIs
function pickAllFruits() {
  return Promise.all([getApple(), getBanana()]).then((fruits) =>
    fruits.join(" + ")
  );
}
pickAllFruits().then(console.log);

function pickOnlyOne() {
  return Promise.race([getApple(), getBanana()]);
}
pickOnlyOne().then(console.log);
