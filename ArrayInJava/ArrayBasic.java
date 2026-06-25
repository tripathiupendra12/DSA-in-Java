// import java.util.*;

public class ArrayBasic{

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
public static void main(String args[]) {
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);
        int marks[] = {89, 93, 97};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


        // for (int i = 0; i < 5; i++) {
        //     int subMar = sc.nextInt();
        //     marks[i] = subMar;
        // }
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);


        // Calculate length of array
        // System.out.println(marks.length);
    }
}