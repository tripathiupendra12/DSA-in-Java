
import java.lang.foreign.SymbolLookup;

public class ConstructorChaining {
    public static void main(String[] args) {
       SubClass sub = new SubClass();

    }
}

// class Student {
//     String name;
//     int id;

//     public Student() {
//         this("Default Name", 0); // Calls the two-argument constructor
//         System.out.println("No-arg constructor called.");
//     }

//     public Student(String name, int id) {
//         this.name = name;
//         this.id = id;
//         System.out.println("Two-arg constructor called. Name: " + name + ", ID: " + id);
//     }
// }

class SuperClass {
    public SuperClass(String msg) {
        System.out.println("SuperClass constructor :" + msg);
    }
}

class SubClass extends  SuperClass {
    public SubClass() {
        super("Hello from subClass"); // calls the superClass constructor
        System.out.println("SubClass constructor called.");
    }
}