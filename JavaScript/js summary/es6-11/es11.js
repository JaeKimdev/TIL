/**
 * Optional Chaining (ES11)
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Optional_chaining
 */
{
  const person1 = {
    name: "Jae",
    job: {
      title: "S/W Engineer",
      manager: {
        name: "Bob",
      },
    },
  };
  const person2 = {
    name: "Bob",
  };

  // Old
  {
    function printManager(person) {
      console.log(person.job.manager.name);
    }
    printManager(person1);
    // printManager(person2); //Error
  }

  // Old - Ternary Operator
  {
    function printManager(person) {
      console.log(
        person.job
          ? person.job.manager
            ? person.job.manager.name
            : undefined
          : undefined
      );
    }
    printManager(person1);
    printManager(person2);
  }

  // &&(and) ...
  {
    function printManager(person) {
      console.log(person.job && person.job.manager && person.job.manager.name);
    }
    printManager(person1);
    printManager(person2);
  }

  // New - Optional Chaining
  {
    function printManager(person) {
      console.log(person.job?.manager?.name);
    }
    printManager(person1);
    printManager(person2);
  }
  console.clear();
}

/**
 * Nullish Coalescing Operator (ES11)
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Nullish_coalescing_operator
 */
{
  // Logical OR operator
  // false: false, '', 0, null, undefined
  {
    const name = "Jae";
    const userName = name || "Guest"; // or 연산자는 앞에 있는 값이 false일때만 뒤에 값을 실행(여기서는 name값이 있기 때문에 flase가 아님)
    console.log(userName);
  }

  {
    const name = null;
    const userName = name || "Guest";
    console.log(userName);
  }

  // Bad - Bug
  {
    const name = "";
    const userName = name || "Guest"; // name이 null이거나 undefined일때만 뒤의 값을 넣어주고 싶은데 이렇게 문자열이 비어있는 경우에도 guest가 할당되는 오류발생
    console.log(userName);

    const num = 0;
    const message = num || "undefined"; // 0이 할당되어 있음에도 undefined가 할당됨
    console.log(message);
  }

  // New
  {
    const name = "";
    const userName = name ?? "Guest";
    console.log(userName);

    const num = 0;
    const message = num ?? "undefined";
    console.log(message);
  }
}
