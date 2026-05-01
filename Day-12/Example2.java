import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");
        set.add("Grapes");
        set.add("Orange");
        set.add("Mango");

        ArrayList<String> list = new ArrayList<>(set);

            for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}