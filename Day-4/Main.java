class Example {
    private int a = 10;     
    int b = 20;             
    protected int c = 30;   
    public int d = 40;     

    public void showInside() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        // creat a new object 

        Example obj = new Example();

        System.out.println(obj.b);    // default
        System.out.println(obj.c);    //  protected
        System.out.println(obj.d);    // public

        obj.showInside(); 
    }
}