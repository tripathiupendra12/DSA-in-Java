public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat(); 

        Dog dobby = new Dog();
        dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // Fish shark = new Fish();
        // shark.eat();

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }

// // Derived class/ subclass
// class Fish extends Animal{
//     int fins;

//     void swim() {
//         System.out.println("Swim");
//     }
// }

class Mammals extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}

class Dog extends Mammals {
    void bark() {
        System.out.println("Barking");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
} 

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}