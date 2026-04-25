// super class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Example_2 {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.sound(); 
    }
}