// static 정적 프로퍼티, 메소드

class Fruit {
  static MAX_FRUITS = 4;
  constructor(name, emoji) {
    this.name = name;
    this.emoji = emoji;
  }

  // 클래스 레벨의 메소드
  static makeRandomFruit() {
    // 클래스 레벨의 메소드에서는 this를 참조할 수 없음
    return new Fruit("banana", "🍌");
  }

  // 인스턴스 레벨의 메소드
  display = () => {
    console.log(`${this.name}: ${this.emoji}`);
  };
}

// 클래스 레벨의 함수는 클래스 이름으로 접근 가능
const banana = Fruit.makeRandomFruit();
console.log(banana);
console.log(Fruit.MAX_FRUITS);

// apple은 Fruit 클래스의 인스턴스이다
const apple = new Fruit("apple", "🍎");
// orange는 Fruit 클래스의 인스턴스이다
const orange = new Fruit("orange", "🍊");

console.log(apple);
console.log(orange);
console.log(apple.name);
console.log(apple.emoji);
apple.display();

Math.pow();
Number.isFinite(1);
