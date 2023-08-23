import java.util.Scanner;

public class J02004 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(doiXung(n, arr));
        }
    }

    public static String doiXung(int n, int[] arr) {

        for (int i = 0; i <= n/2; i++) {
            if (arr[i] != arr[n-i-1]) return "NO";
        }
        return "YES";
    }
}
