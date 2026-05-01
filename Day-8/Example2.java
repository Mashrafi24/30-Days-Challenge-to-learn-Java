abstract class Shape {
    abstract void area();

    void display() {
        System.out.println("Calculating shape area...");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        s.area();
    }
}