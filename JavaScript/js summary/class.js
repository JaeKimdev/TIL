`use strict`;

//Object-oriented programming
// class: template
// object: instance of a class
// JavaScript classes
// - introduced in ECMAScript 6
// - syntactical sugar over prototype-based inheritance

// 1. Class declarations
class Person {
  //constructor
  constructor(name, age) {
    //fields
    this.name = name;
    this.age = age;
  }

  // methods
  speak() {
    console.log(`Hello, ${this.name}`);
  }
}

const jae = new Person("Jae", 20);
console.log(jae.name);
console.log(jae.age);
jae.speak();

// 2. Getters and setters
class User {
  constructor(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  get age() {
    return this._age;
  }

  set age(value) {
    // if (value < 0) {
    //  throw Error("Age can't be negative");
    // }
    // this._age = value;

    // same as above
    this._age = value < 0 ? 0 : value;
  }
}

const user1 = new User("Steve", "Jobs", -1);
console.log(user1.age);

// 3. Fields (public, private)

class Experiment {
  publicField = 2;
  #privateField = 3;
}
const experiment = new Experiment();
console.log(experiment.publicField);
console.log(experiment.privateField); // undefined

// 4. Static properties and methods

class Article {
  static publisher = "Jae";

  constructor(articleNumber) {
    this.articleNumber = articleNumber;
  }

  static printPublisher() {
    console.log(Article.publisher);
  }
}

const article1 = new Article(1);
const article2 = new Article(2);
console.log(article1.publisher); // undefined
console.log(Article.publisher); // Jae
Article.printPublisher();

// 5. Inheritance
// a way for one class to extend another

class Shape {
  constructor(height, width, color) {
    this.height = height;
    this.width = width;
    this.color = color;
  }

  draw() {
    console.log(`Drawing ${this.color} color`);
  }

  getArea() {
    return this.height * this.width;
  }
}

class Rectangle extends Shape {}
class Triangle extends Shape {
  draw() {
    super.draw();
    console.log("🔺");
  }

  getArea() {
    return (this.height * this.width) / 2;
  }
}

const rectangle = new Rectangle(20, 20, "blue");
rectangle.draw();
console.log(rectangle.getArea());
const triangle = new Triangle(20, 20, "red");
triangle.draw();
console.log(triangle.getArea());

// 6. Class checking: instanceof
console.log(rectangle instanceof Rectangle); // true
console.log(triangle instanceof Rectangle); // false
console.log(triangle instanceof Triangle); // true
console.log(triangle instanceof Shape); // true
console.log(triangle instanceof Object); // true

JavaScript Reference: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference