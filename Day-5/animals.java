class Animal {
    String name;

    //  constructor
    Animal(String n) {
        name = n;
    }

    void sound() {
        System.out.println(name + " makes a sound");
    }
}

public class animals {
    public static void main(String[] args) {
        Animal a1 = new Animal("Cat");
        Animal a2 = new Animal("Cow");

        a1.sound();
        a2.sound();
    }
}