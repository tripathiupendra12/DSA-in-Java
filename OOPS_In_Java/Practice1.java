public class Practice1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "AMan";
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int marks;
} 