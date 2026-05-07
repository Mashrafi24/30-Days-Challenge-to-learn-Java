import java.io.File;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws Exception {

        File file = new File("input.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}