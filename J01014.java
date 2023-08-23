import java.util.Scanner;

public class J01014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(maxPrimeDivisor(n));
        }
    }

    public static long maxPrimeDivisor(long n) {

        long res = 0;

        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (prime(n/i)) return n/i;
                if (prime(i)) res = i;
            }
        }
        return res;
    }

    public static boolean prime(long n) {
        if (n <= 1) return false;
        for (long i = 2; i*i <= n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
