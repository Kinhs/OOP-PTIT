import java.util.Scanner;
import java.lang.Math;

public class J01012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int cnt = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) cnt++;
                    if ((n/i) % 2 == 0 && i != Math.sqrt(n)) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}