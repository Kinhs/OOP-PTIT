import java.util.Scanner;

public class J01007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        long[] Fibonacci = new long[93];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        for(int i = 2; i < 93; i++) {
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        }

        while(testNumber-->0) {
            long n = scanner.nextLong();
            int index = 0;
            while(true) {
                if (Fibonacci[index] == n) {
                    System.out.println("YES");
                    break;
                } else if (Fibonacci[index] > n) {
                    System.out.println("NO");
                    break;
                } else {
                    index++;
                }
            }
        }
    }
}