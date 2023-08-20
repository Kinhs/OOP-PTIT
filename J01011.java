import java.util.Scanner;

public class J01011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            long a = scanner.nextInt(), b = scanner.nextInt();
            System.out.printf("%d %d\n", a*b/gcd(a, b), gcd(a, b));
        }
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
