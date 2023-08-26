import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            long n = scanner.nextLong();
            long res = 1;
            for (long i = 1; i <= n; i++) {
                res = bcnn(res, i);
            }
            System.out.println(res);
        }
    }

    public static long bcnn (long a, long b) {
        return a*b/gcd(a, b);
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
