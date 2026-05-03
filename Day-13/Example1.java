import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 1);
        map.put("Mango", 3);
        map.put("Grapes", 4);
        map.put("Orange", 5);

        for (int i = 0; i < map.size(); i++) {
            String key = (String) map.keySet().toArray()[i];
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}