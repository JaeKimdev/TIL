const num1 = 123;
const num2 = new Number(123);
console.log(num1);
console.log(num2);
console.log(typeof num1);
console.log(typeof num2);

console.log(Number.MAX_VALUE);
console.log(Number.MIN_VALUE);
console.log(Number.MAX_SAFE_INTEGER);
console.log(Number.MIN_SAFE_INTEGER);
console.log(Number.NaN);
console.log(Number.NEGATIVE_INFINITY);
console.log(Number.POSITIVE_INFINITY);

// example
if (num1 === Number.NaN) {
  console.log("num1 is NaN");
}
if (Number.isNaN(num1)) {
  console.log("num1 is NaN");
}

//지수 표기법 (매우 크거나 작은 숫자를 표기할 때 사용, 10의 n승으로 표기)
const num3 = 102;
console.log(num3.toExponential()); // 1.02e2 -> 1.02 * 10의 2승

// 반올림하여 문자열로 변환
const num4 = 1234.12;
console.log(num4.toFixed()); // 1234

console.log(num4.toString()); // 1234.12
console.log(num4.toLocaleString("ar-EG")); // ١٬٢٣٤٫١٢ 아라빅 언어로 표시

// 원하는 자리수까지 유효하도록 반올림
console.log(num4.toPrecision(5)); // 1234.1 5자리수만 표기
console.log(num4.toPrecision(4)); // 1234
console.log(num4.toPrecision(2)); // 전체 자리수 표기가 안될때는 지수표기법으로 표시

console.log(Number.EPSILON); // 0과 1 사이에서 나타낼 수 있는 가장 작은 숫자

if (Number.EPSILON > 0 || Number.EPSILON < 1) {
  console.log(Number.EPSILON);
}
const num5 = 0.1 + 0.2 - 0.2; // 0.1 ?
console.log(num5); // 0.10000000000000003
// 숫자를 2진수로 변환하여 계산하고 다시 변환하는 과정중에 부동소숫점 오차가 발생.

function isEqualFirst(original, expected) {
  return original === expected;
}
console.log(isEqualFirst(1, 1));
console.log(isEqualFirst(0.1, 0.1));
console.log(isEqualFirst(num5, 0.1)); // false

function isEqual(original, expected) {
  return original - expected < Number.EPSILON;
}

console.log(isEqual(1, 1));
console.log(isEqual(0.1, 0.1));
console.log(isEqual(num5, 0.1)); // true
