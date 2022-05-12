// typeof: 데이터 타입을 확인
// dynamic, weakly typed programming language - JS는 동적으로 할당된 값에 따라 타입이 변경된다
let variable;
console.log(typeof variable);

variable = "";
console.log(typeof variable);

variable = 123;
console.log(typeof variable);

variable = {};
console.log(typeof variable);

variable = function () {};
console.log(typeof variable);

variable = Symbol();
console.log(typeof variable);
