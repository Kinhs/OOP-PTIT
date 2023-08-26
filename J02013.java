import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int step = 1; step <= n; step++) {
            boolean isSorted = true;
            for (int i = 0; i < n-1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
            System.out.printf("Buoc %d: ", step);
            for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
