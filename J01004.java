import java.util.Scanner;

public class J01004 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        while(testNumber-->0) {
            int n = scanner.nextInt();
            System.out.println(isPrime(n));
        }
    }

    static String isPrime(int n) {

        if (n <= 1) return "NO";
        int squareRoot = (int)Math.sqrt(n);
        for (int i = 2; i <= squareRoot + 1; i++) {
            if (n % i == 0) return "NO";
        }
        return "YES";
    }
}
