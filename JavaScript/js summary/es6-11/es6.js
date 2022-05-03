/**
 * Shorthand property names
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Object_initializer
 *
 */

{
  const jae1 = {
    name: "Jae",
    age: 20,
  };

  const name = "Jae";
  const age = 20;

  // Old
  const jae2 = {
    name: name,
    age: age,
  };

  // New
  const jae3 = {
    name,
    age,
  };

  console.log(jae1, jae2, jae3);
  console.clear();
}

/**
 * Destructuring Assignment
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment
 *
 */

{
  // object
  const student = {
    name: "Jae",
    level: 1,
  };

  // Old
  {
    const name = student.name;
    const level = student.level;
    console.log(name, level);
  }

  // New
  {
    const { name, level } = student;
    console.log(name, level);

    const { name: newStudentName, level: newStudentLevel } = student;
    console.log(newStudentName, newStudentLevel);
  }

  //  array
  const animals = ["Dog", "Cat"];

  // Old
  {
    const first = animals[0];
    const second = animals[1];
    console.log(first, second);
  }

  // New
  const [first, second] = animals;
  console.log(first, second);
  console.clear();
}

/**
 * Spread Syntax
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Spread_syntax
 *
 */
{
  const obj1 = { key: "key1" };
  const obj2 = { key: "key2" };
  const array = [obj1, obj2];

  // array copy
  const arrayCopy = [...array]; // 레퍼런스 값만 복사하기 때문에 값이 변경되면 함께 변경됨
  console.log(array, arrayCopy);
  obj1.key = "newKey";

  const arrayCopy2 = [...array, { key: "key3" }];
  console.log(array, arrayCopy, arrayCopy2);

  //object copy
  const cbj3 = { ...obj1 };
  console.log(cbj3);

  // array concatenation
  const fruits1 = ["Apple", "Orange"];
  const fruits2 = ["Banana", "Grape"];
  const fruits = [...fruits1, ...fruits2];
  console.log(fruits);

  //object merge
  const dog1 = { dog1: "🐶" };
  const dog2 = { dog2: "🐩" };
  const dogs = { ...dog1, ...dog2 };
  console.log(dogs);
}
