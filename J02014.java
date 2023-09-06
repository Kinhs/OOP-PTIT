import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (i == 0) {
                    b[i] = a[i];
                } else {
                    b[i] = b[i-1] + a[i];
                }
                sum += a[i];
            }
            int res = -1;
            for (int i = 1; i < n; i++) {
                if (b[i-1] == sum - b[i]) {
                    res = i+1;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
