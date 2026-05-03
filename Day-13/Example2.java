import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        map.remove(2);

        for (int i = 0; i < map.size(); i++) {
            int key = (int) map.keySet().toArray()[i];
            String value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}