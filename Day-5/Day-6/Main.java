class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat says meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();   // inherited
        c.meow();  
    }
}