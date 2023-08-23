import java.util.Scanner;
import java.lang.Math;

public class J01018 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String daySo = scanner.nextLine();
            System.out.println(lienKe(daySo));
        }
    }

    public static String lienKe(String daySo) {

        int sum = daySo.charAt(daySo.length()-1) - '0';

        for (int i = 0; i < daySo.length()-1; i++) {
            if (Math.abs((daySo.charAt(i) - daySo.charAt(i+1))) != 2) {
                return "NO";
            }
            sum += daySo.charAt(i) - '0';
        }
        if (sum % 10 == 0) return "YES";

        return "NO";
    }
}
