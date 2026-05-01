import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        set.add(20);

        ArrayList<Integer> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}