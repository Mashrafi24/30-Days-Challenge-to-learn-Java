class Car {
    String color;

    Car(String c) {
        color = c;
    }

    void show() {
        System.out.println(color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Blue");
        Car c2 = new Car("Green");

        c1.show();
        c2.show();
    }
}