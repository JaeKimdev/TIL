// 정직원과 파트타임을 나타낼 수 있는 클래스를 만들어보자
// 직원들의 정보: 이름, 부서, 한달 근무시간
// 매달 직원들의 정보를 이용해서 한달 월급을 계산할 수 있다
// 정직원은 시간당 10000원
// 파트타임 직원은 시간당 8000원

class Employee {
  constructor(name, department, workingHours) {
    this.name = name;
    this.department = department;
    this.workingHours = workingHours;
  }
}

class FulltimeEmployee extends Employee {
  #PAY_RATE = 10000;
  salary = () => {
    return this.workingHours * this.#PAY_RATE;
  };
}

class ParttimeEmployee extends Employee {
  #PAY_RATE = 8000;
  salary = () => {
    return this.workingHours * this.#PAY_RATE;
  };
}

const jae = new FulltimeEmployee("Jae", "IT Team", 38);
const john = new ParttimeEmployee("John", "IT Team", 20);
console.log(jae.salary());
console.log(john.salary());
