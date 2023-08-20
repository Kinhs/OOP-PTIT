import java.util.Scanner;

public class J01010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while(t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(catDoi(s));
        }
    }

    static String catDoi(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '9' && s.charAt(i) != '8' && s.charAt(i) != '1') return "INVALID";
        }
        s = s.replace('9', '0');
        s = s.replace('8', '0');
        int index = 0;
        while(s.charAt(index) == '0' && index < s.length() - 1) index++;
        String res = s.substring(index);
        if (res.equals("0")) return "INVALID";
        return res;
    }
}
