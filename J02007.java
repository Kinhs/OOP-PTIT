import java.util.Scanner;

public class J02007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] dd = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                dd[a[i]]++;
            }
            System.out.println("Test "+ t +":");
            for (int i = 0; i < n; i++) {
                if (dd[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], dd[a[i]]);
                    dd[a[i]] = 0;
                }
            }
        }
    }
}
