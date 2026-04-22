class Student {
    private String name;   
    public static int count = 0; 

   
    public void setName(String name) {
        this.name = name;
    }

   
    public String getName() {
        return name;
    }

    
    public void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Mash"); 
        s1.display();

        
        System.out.println("Count: " + Student.count);
    }
}