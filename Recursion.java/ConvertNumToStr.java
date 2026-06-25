public class ConvertNumToStr {

    static String numberWords[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void numToStr(int number) {

        if(number == 0) {
            return;
        }

        int lastDigit = number % 10;
        numToStr(number/10);
        System.out.print(numberWords[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int number = 1947;
        numToStr(number);
    }
}