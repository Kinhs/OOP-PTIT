import java.util.Scanner;
import java.lang.Math;

public class J01017 {

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

        for (int i = 0; i < daySo.length()-1; i++) {
            if (Math.abs((int)daySo.charAt(i) - (int)daySo.charAt(i+1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
