class Student {
    private int marks = 80;     
    int roll = 1;               
    protected String dept = "ICT"; 
    public String name = "Mash";   

    public void showDetails() {
        System.out.println(name + " " + roll + " " + dept + " " + marks);
    }
}

public class Name {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.roll);   
        System.out.println(s.dept);   
        System.out.println(s.name);   

        s.showDetails(); 
    }
}