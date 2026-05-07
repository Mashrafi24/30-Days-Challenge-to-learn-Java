import java.io.*;

public class Example1 {
    public static void main(String[] args) throws Exception {

        FileOutputStream out = new FileOutputStream("data.bin");
        out.write('A');
        out.write('p');
        out.write('p');
        out.write('l');
        out.write('e');

        out.close();

        FileInputStream in = new FileInputStream("data.bin");

        int ch;
        while ((ch = in.read()) != -1) {
            System.out.println((char) ch);
        }

        in.close();
    }
}