import java.io.FileWriter;

public class Example2 {
    public static void main(String[] args) throws Exception {

        FileWriter writer = new FileWriter("test.txt");

        writer.write("Hello World");

        writer.close();

        System.out.println("File written");
    }
}