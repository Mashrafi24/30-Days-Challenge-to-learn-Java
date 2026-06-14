class Person {
    String name;

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int id;

    void showId() {
        System.out.println("ID: " + id);
    }
}

public class Example {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mashrafi"; // inherited
        s.id = 24034;

        s.showName(); // inherited
        s.showId();   
    }
}