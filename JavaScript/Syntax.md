## - Data Type

1. Number

1) 정수(Integer) // 1, 2, 3, 4 ...
2) 소수(Float) // 1.555, 2.545345 ...

   - Number타입은 서로 연산기호를 이용하여 계산할 수 있다.

2.  String
    : 처음부터 끝까지 문자(Text)로 구성되어 있다는 의미

        "Hello," + " My name is Nico" // Hello, My name is Nico

- String타입은 ""을 이용하여 입력하고 String타입의 합은 두개를 합쳐서 출력한다.

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
daysOfWeek.push("holiday"); //push is a function of adding.
```

## - Objects

The object stores data with property and uses {}.

```js
const player = {
  name: tomato,
  color: red,
  food: true,
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

## - Function

펑션의 괄호 안의 매개변수에서 아규먼트를 받아들일 수 있다.

```js
function sayHello(nameOfPerson) {
  console.log(nameOfPerson);
}

sayHello("nico");
sayHello("dal");
sayHello("lynn"); // nameOfPerson은 "nico" "dal" "lynn" 을 받았다고 생각하면 됨.
```

You can input argument more than one

```js
function sayHello(nameOfPerson, age) {
  console.log(nameOfPerson);
}

sayHello("nico", 12);
sayHello("dal", 20);
sayHello("lynn", 23); // sayHello function의 매개변수 2개는 아래 2개의 argument를 받는 중임.
```

function의 값은 function 안에서만 존재한다.

오브젝트 안에서 매개변수가 아규먼트를 받는 방식

```js
const player = {
  name: function (Name) {
    console.log("Your Name is " + Name + " 입니다.");
  },
  sayHello: function (Age) {
    console.log("Your age is " + Age + " 입니다.");
  },
};

player.sayHello(14);
```

## - Conditionals

`prompt`

The prompt() method displays a dialog box that prompts the user for input.

`parseInt`

The parseInt() function parses a string argument and returns an integer of the specified radix.

Ref: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/parseInt

```js
const age = parseInt(prompt("Please write your age"));
console.log(age);
```

- Number() vs parseInt()

  ```js
  const A = Number("123asd123");
  console.log(A); //NaN

  const B = parseInt("123 asd123");
  console.log(B); //123
  ```

- IF

```js
const age= parseInt(prompt (“How old are you?”));
console.log(isNaN(age));

if(isNaN(age)){
  console.log(“please wirte a number”);
} else{
  console.log(“Thank you for writing your age”);
}
```

&& : and

|| : or
<br><br>

- Strict equality (===)

checks whether its two operands are equal, returning a Boolean result.

<br>

ex>

```js
0 == false ---> true  //0 == false(deafult:0) true(same)
0 === false ---> false //0(number) === false(boolean) false(difference)
```

Ref: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Strict_equality

- = is used for assigning values to a variable in JavaScript.

- == is used for comparison between two variables irrespective of the datatype of variable.

- === is used for comparision between two variables but this will check strict type, which means it will check datatype and compare two values.

<br>

# JavaScript on the browser

## # Document object

If you enter a document in the console, you can get the HTML you created.

The document is an object that exists in the browser.

Calling a `console.dir(document)` to the console is the same as the title defined by HTML.

It is possible to obtain a title from an HTML document object in JS.

JS can set to access and read HTML.

You can also change html through js like, `document.title = "Hi";`

When you call `document.body`, you only bring in body items.

Ref: Console Object- https://jongbeom-dev.tistory.com/115

## # HTML in JS

`document.getElementById(“title”)` can call id in HTML

JS shows the object that html expresses then we can change any element.

`title.innerText = "Got you!";` change innerText

```js
console.log(title.id); //take id

console.log(title.className); //take className
```
