import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Shakib");
        map.put(2, "Shuvo");
        map.put(3, "Shanto");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}