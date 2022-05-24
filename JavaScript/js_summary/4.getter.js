// 접근자 프로퍼티 (Accessor Property)
class Student {
  constructor(firstname, lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }
  get fullName() {
    return `${this.firstname} ${this.lastname}`;
  }

  set fullName(value) {
    console.log("set :", value);
  }
}

const student = new Student("Jae", "Kim");
student.firstname = "John";
console.log(student.firstname);
console.log(student.fullName);
student.fullName = "Kyle Watson";
