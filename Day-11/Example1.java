import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(2);

      for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
    }
}