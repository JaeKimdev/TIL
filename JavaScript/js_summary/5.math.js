// Math
// static properties, method
console.log(Math.E); // 오일러 상수, 자연로그의 밑
console.log(Math.PI); // 원주율

// static methods
// 절대값
console.log(Math.abs(-10)); // 10
// 소수점 이하를 올림
console.log(Math.ceil(3.14)); // 4
// 소수점 이하를 내림
console.log(Math.floor(3.14)); // 3
// 소수점 이하를 반올림
console.log(Math.round(3.14)); // 3
console.log(Math.round(3.74)); // 4
// 정수만 변환
console.log(Math.trunc(3.141952)); // 3

// 최대, 최소값을 찾기
console.log(Math.max(1, 2, 3, 4, 5)); // 5
console.log(Math.min(1, 2, 3, 4, 5)); // 1

// 거듭제곱
console.log(2 ** 3);
console.log(Math.pow(2, 3)); // 8

// 제곱근
console.log(Math.sqrt(9)); // 3

// 랜덤한 값을 반환
console.log(Math.random());

// 1~10 사이의 랜덤한 정수를 반환
console.log(Math.floor(Math.random() * 10 + 1));
