import java.util.ArrayList;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Example1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Mash"));
        list.add(new Student(2, "Ivan"));
        list.add(new Student(3, "Priya"));
        list.add(new Student(4, "Ravi"));

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}