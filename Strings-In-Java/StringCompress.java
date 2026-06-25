

public class StringCompress {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++) {
            sb.append(str.charAt(i));
            Integer Count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                Count++;
                i++;
            }
            if(Count > 1) {
                sb.append(Count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccd";
        System.out.println(compress(str));
    }
}