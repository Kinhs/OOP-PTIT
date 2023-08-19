import java.util.Scanner;

public class J01008 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int testCase = t;

        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.printf("Test %d: ", testCase - t);
            for(int i = 2; i <= n; i++) {
                int count = 0;
                while(n % i == 0) {
                    count++;
                    n /= i;
                }
                if(count > 0) {
                    System.out.printf("%d(%d) ", i, count);
                }
            }
            System.out.println();
        }
    }
}
