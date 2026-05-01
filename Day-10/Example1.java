import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Samsung");
        list.add("Vivo");
        list.add("Oppo");

        for (String item : list) {
            System.out.println(item);
        }
    }
}