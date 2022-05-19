// 함수 내부에서 외부로부터 주어진 인자의 값을 변경하는 것은 좋지 않다.
// 만약 상태변경이 필요한 경우에는, 새로운 상태를(오브젝트, 값)을 만들어서 반환해야 함.
// 원시값 - 값에 의한 복사
// 객체값 - 참조에 의한 복사 (메모리 주소)
function display(num) {
  num = 5; // ❌
  console.log(num);
}
const value = 4;
display(value);
console.log(value);

function displayObj(obj) {
  obj.name = "John"; // ❌ 외부로부터 주어진 인자(오브젝트)를 내부에서 변경하면 안되요
  console.log(obj);
}
const jae = { name: "Jae" };
displayObj(jae);
console.log(jae);

function changeName(obj) {
  //함수 내부에서 무언가를 변경한다면 먼저 함수 이름부터 무언가를 변경한다는 내용으로 바꿔주자!
  return { ...obj, name: "John" }; // 반환할때는 새로운 오브젝트를 만들기!!
}
