class Animal {
  constructor(color) {
    this.color = color;
  }
  eat() {
    console.log("eat");
  }
  sleep() {
    console.log("sleep");
  }
}

class Tiger extends Animal {}
const tiger = new Tiger("yellow");
console.log(tiger);
tiger.sleep();
tiger.eat();

class Dog extends Animal {
  constructor(color, ownerName) {
    super(color); // super는 부모 클라스를 의미
    this.ownerName = ownerName;
  }
  play() {
    console.log("play");
  }
  //Overriding
  eat() {
    super.eat();
    console.log("Dog eat");
  }
}
const dog = new Dog("red", "Jae");
console.log(dog);
dog.sleep();
dog.eat();
dog.play();
