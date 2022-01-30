public class TestCircle {

    public static void main(String[] args) {

        Circle[] circles = new Circle[5];
        circles[0] = new Circle();
        circles[1] = new Circle(4);
        circles[2] = new Circle(2);
        circles[3] = new Circle(3);
        circles[4] = new Circle(5);

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Circle " + (i + 1) + ": ");
            circles[i].getAreaAndCircumference();
        }
    }
}
