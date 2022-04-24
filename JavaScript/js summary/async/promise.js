`use strict`;

// Promise is a JavaScript object for asynchronous operation.
// State: pending -> fulfilled or rejected
// Producer vs Consumer

// 1. Producer
// when new Promise is created, the executor runs automatically.
const promise = new Promise((resolve, reject) => {
  // do something heavy work (network, read files, etc)
  console.log("doing something...");
  setTimeout(() => {
    resolve("jae");
    // reject(new Error("no network"));
  }, 2000);
});

// 2. Consumer: then, catch, finally
// chaining - promise는 then을 통해서 promise를 반환하기 때문에 다시 리턴된 값에 catch를 사용할 수 있다.
promise //
  .then((value) => {
    console.log(value);
  })
  .catch((error) => {
    console.log(error);
  })
  .finally(() => {
    // 성공, 실패에 상관없이 어떤 기능을 수행하고 싶을 때 finally를 사용한다.
    console.log("finally");
  });

// 3. Promise chaining
const fetchNumber = new Promise((resolve, reject) => {
  setTimeout(() => resolve(1), 1000);
});

fetchNumber
  .then((num) => num * 2)
  .then((num) => num * 3)
  .then((num) => {
    return new Promise((resolve, reject) => {
      setTimeout(() => resolve(num - 1), 1000);
    });
  })
  .then((num) => console.log(num));

// 4. Error Handling
const getHen = () =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve("🐔"), 1000);
  });
const getEgg = (hen) =>
  new Promise((resolve, reject) => {
    // setTimeout(() => resolve(`${hen} => 🥚`), 1000);
    setTimeout(() => reject(new Error(`error! ${hen} => 🥚`)), 1000);
  });
const cook = (egg) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${egg} => 🍳`), 1000);
  });

getHen()
  .then((hen) => getEgg(hen)) // can write .then(getEgg)
  .then((egg) => cook(egg))
  .then((meal) => console.log(meal));

// same as above
getHen() //
  .then(getEgg)
  .then(cook)
  .then(console.log);

// If fail to get egg - reject
getHen() //
  .then(getEgg)
  .then(cook)
  .then(console.log)
  .catch(console.log); // 에러를 마지막으로 보내서 처리

getHen() //
  .then(getEgg)
  .catch((error) => {
    // 계란을 받아오다 문제가 생기면 빵을 가져다가 처리하도록 한다.
    return "🍞";
  })
  .then(cook)
  .then(console.log)
  .catch(console.log);
