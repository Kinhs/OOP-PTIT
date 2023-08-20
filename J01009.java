import java.util.Scanner;

public class J01009 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += giaithua(i);
        }
        System.out.print(sum);
    }

    static long giaithua(long i) {
        long res = 1;
        for (long j = 1; j <= i; j++) {
            res *= j;
        }
        return res;
    }
}
