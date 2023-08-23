import java.util.Scanner;
import java.lang.Math;

public class J01026 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int squareRoot = (int)Math.sqrt(n);
            if (squareRoot*squareRoot == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
