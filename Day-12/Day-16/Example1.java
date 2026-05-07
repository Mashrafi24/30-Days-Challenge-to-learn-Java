import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) throws Exception {

        FileOutputStream out = new FileOutputStream("data.txt");

        out.write('A');
        out.write('P');
        out.write('P');
        out.write('L');
        out.write('E');

        out.close();

        FileInputStream in = new FileInputStream("data.txt");

        int ch;

        while ((ch = in.read()) != -1) {
            System.out.println((char) ch);
        }

        in.close();
    }
}