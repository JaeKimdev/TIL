public class Circle {

    double radius;
    double area;
    double circumference;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double a) {
        radius = a;
    }

    public void getAreaAndCircumference() {
        area = Math.PI * radius * radius;
        circumference = Math.PI * 2 * radius;
        if (radius == 1) {
            System.out.println("This is a unit circle!");
        } else {
            System.out.println("Area: " + area + ", Circumference: " + circumference);
        }
    }
}
