import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {

        HashMap<String, Integer> student = new HashMap<>();

        student.put("Mash", 90);
        student.put("Ivan", 85);
        student.put("Pussy", 95);
        student.put("Virat", 80);

        for (int i=0;   i<student.size(); i++) {
            String name = (String) student.keySet().toArray()[i];
            int marks = student.get(name);
            System.out.println(name + " " + marks);
        }
    }
}