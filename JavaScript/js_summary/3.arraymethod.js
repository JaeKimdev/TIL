// 배열의 함수들
// 배열 자체를 변경하는지, 새로운 배열을 반환하는지 확인

const fruits = ["apple", "banana", "orange"];

// 특정한 오브젝트가 배열인지 체크
console.log(Array.isArray(fruits));
console.log(Array.isArray({}));

// 특정한 아이템의 위치를 찾을 때
console.log(fruits.indexOf("banana"));

// 배열안에 특정한 아이템이 있는지 체크
console.log(fruits.includes("banana"));

// 추가 - 제일 뒤에 추가 - 배열 자체를 수정(업데이트)
let length = fruits.push("grape");
console.log(fruits);
console.log(length);

// 추가 - 제일 앞에 추가 - 배열 자체를 수정(업데이트)
fruits.unshift("kiwi");
console.log(fruits);
console.log(fruits.length);

// 제거 - 제일 뒤 - 배열 자체를 수정(업데이트)
let lastItem = fruits.pop();
console.log(fruits);
console.log(lastItem);

// 제거 - 제일 앞 - 배열 자체를 수정(업데이트)
lastItem = fruits.shift();
console.log(fruits);
console.log(lastItem);

// 중간에 추가 또는 삭제 - 배열 자체를 수정(업데이트)
const deleted = fruits.splice(1, 1); // 1번째 인덱스에서 1개 삭제
console.log(fruits);
console.log(deleted);
fruits.splice(1, 0, "kiwi"); // 1번째 인덱스에서 0개 삭제하고 kiwi를 추가
console.log(fruits);

// 잘라진 새로운 배열을 만듬
let newArr = fruits.slice(0, 2); // 0번째(포함)부터 2번째(미포함)까지 잘라냄
console.log(newArr);
console.log(fruits);

newArr = fruits.slice(); // 아무것도 입력하지 않으면 0부터 전체를 잘라내서 전체 배열이 리턴됨
console.log(newArr);

newArr = fruits.slice(-1); // 제일 뒤에서 1번째부터 잘라냄
console.log(newArr);

// 여러개의 배열을 붙여줌
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const arr3 = arr1.concat(arr2);
console.log(arr1);
console.log(arr2);
console.log(arr3);

// 배열 순서를 거꾸로 뒤집음
const arr4 = arr3.reverse();
console.log(arr4);
console.clear();

// 중첩 배열을 하나의 배열로 쫙 펴기
let arr = [
  [1, 2, 3],
  [4, [5, 6]],
];
console.log(arr);
console.log(arr.flat()); // 1단계만 펴줄 수 있다
console.log(arr.flat(2)); // 2단계까지 펴주려면 지정해서 실행해야 한다(3단계라면 3으로 실행)
arr = arr.flat(2); // 기존 배열을 변경하지 않고 새로운 배열을 반환하기 때문에 지정해줌

// 특정한 값으로 배열을 채움 - 배열 자체를 수정
arr.fill(0);
console.log(arr);

arr.fill("s", 1, 3);
console.log(arr);

arr.fill("s", 1);
console.log(arr);

// 배열을 문자열로 합하기
let text = arr.join();
console.log(text);

text = arr.join(" | ");
console.log(text);
