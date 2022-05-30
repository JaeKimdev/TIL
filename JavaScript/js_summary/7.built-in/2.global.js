console.log(globalThis);
console.log(this);
console.log(Infinity);
console.log(NaN);
console.log(undefined);

eval("const num = 2; console.log(num);");
console.log(isFinite(1));
console.log(isFinite(Infinity));

console.log(parseFloat("12.43"));
console.log(parseInt("12.43"));
console.log(parseInt("11"));

// URL (URI, Uniform Resource Identifier의 하위 개념)
// 아스키 문자로만 구성되어야 함
// 한글이나 특수문자는 이스케이프 처리를 해야 한다

const URL = "https://재형닷컴.com";
const encoed = encodeURI(URL);
console.log(encoed);

const decoded = decodeURI(encoed);
console.log(decoded);

// 전체 URL이 아니라 부분적인 것은 Component를 이용
const part = "재형닷컴.com";
console.log(encodeURIComponent(part));
