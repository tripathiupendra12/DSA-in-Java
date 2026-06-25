import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PRACTICE SET 1
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double avg = (a + b + c)/3;
        System.out.println(avg);

        //PRACTICE SET 2
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);

        //PRACTICE SET 3
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totCost = pencil + pen + eraser;
        float totGstCost = (pencil*0.18f) + (pen*0.18f) + (eraser*0.18f);
        System.out.println(totCost-totGstCost);

        // PRACTICE SET 4
        byte bt = 4;
        char ch = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.2322;

        double res = (f*bt) + (i%ch) - (d*s);
        System.out.println(res);

       // PRACTICE SET 5
        int $ = 24;
        System.out.println($);
    }
}