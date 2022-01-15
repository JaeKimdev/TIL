## - Data Type

1. Number
  1) 정수(Integer) // 1, 2, 3, 4 ...
  2) 소수(Float) // 1.555, 2.545345 ...
    * Number타입은 서로 연산기호를 이용하여 계산할 수 있다.

2. String
: 처음부터 끝까지 문자(Text)로 구성되어 있다는 의미

    "Hello," + " My name is Nico" // Hello, My name is Nico

* String타입은 ""을 이용하여 입력하고 String타입의 합은 두개를 합쳐서 출력한다.

## - const → 변수 선언을 통해 코드를 간결하게(use camelCase)

```js
const a = 10;
const b = 2;

console.log(a + b);
console.log(a * b);
console.log(a / b);
```

변수만들때 let, const, var차이
- `let` 재선언 금지, 재할당 가능 CANNOT be re-declared and updated
- `const` 재선언 금지, 재할당 금지 CANNOT be re-declared and CANNOT updated
- `var` 재선언 가능, 재할당 가능 can be re-declared and updated

```js
let a = b;
let a = c;
//재선언 금지

let a = b;
a = c;
//재할당은 가능

const a = b;
const a = c;
//재선언 금지

const a = b;
a = c;
//재할당 금지

var a = b;
var a = c;
a = d;
//재선언, 재할당 가능
```

Ref : https://www.freecodecamp.org/news/var-let-and-const-whats-the-difference/#:~:text=var%20variables%20can%20be%20updated,const%20variables%20are%20not%20initialized.

## Booleans

true is not "true"

null is not false

null is just meaning = 'There is literally nothing'
null never happen automatically.
We use null to make sure something that is nothing.

Undefined is not same type as true,false

**memory has variable but has no value.**

## Arrays

One of the methods for listing data.
Data is always listed in comma (,) in []. Variables can also be used, and data alignment such as boolean, text, and numbers is possible.

```js
const daysOfWeek = ["mon", "tue", "wed", "thu", "fri", "sat", "sun"];
```

If you want to print the 5th element value in the above variable, how should you print it?

```js
console.log(days Of Week[4]) //may be used to output the fifth value.
```

if you want to add one more value to the variable days Of Week, you can do it as follows.

```js
daysOfWeek.push ("holiday") //push is a function of adding.
```
## - Objects
The object stores data with property and uses {}.

```js
const player = {
name : tomato,
color : red,
food : true,
};

console.log(player);
```

There are two ways to call property.

```js
1. console.log(player.name); => tomato
2. console.log(player["name"]); => tomato
```

It is also possible to change the property, but it is impossible to change the declared object.

```js
const player = {
name : tomato,
color : red,
food : true,
};

console.log(player);
player.color = "blue";
console.log(player.color);
--> blue

// You can add property

player.koreanName = "토마토";

--> {name: "tomato", color: "blue", food: true, koreaName: "토마토"}
```

