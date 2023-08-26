import java.util.Scanner;

public class J02010 {

    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean doiCho = false;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[i]) {
                    doiCho = true;
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            if (doiCho) {
                cnt++;
                System.out.print("Buoc "+cnt+ ": ");
                for (int j = 0; j < n; j++) System.out.print(a[j] + " ");
                System.out.println();
            }
        }
    }
}
