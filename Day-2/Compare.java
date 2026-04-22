class Compare {
    public static int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Compare.max(10, 25));
    }
}