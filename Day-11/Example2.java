import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.addFirst("Start");
        list.addLast("End");

          for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
          }
    }
}