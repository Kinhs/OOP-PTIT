import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] dd = new int[205];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            dd[a[i]] = 1;
        }
        boolean ok = true;
        for (int i = 1; i < a[n-1]; i++) {
            if (dd[i] == 0) {
                System.out.println(i);
                ok = false;
            }
        }
        if (ok) System.out.println("Excellent!");
    }
}
