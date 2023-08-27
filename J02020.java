import java.util.Scanner;

public class J02020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int cnt = 1;
        int[] a = new int[k+1];
        for (int i = 1; i <= k; i++) a[i] = i;
        while (true) {
            for (int i = 1; i <= k; i++) System.out.print(a[i] + " ");
            System.out.println();
            int i = k;
            while (a[i] == n-k+i) i--;
            if (i == 0) break;
            cnt++;
            a[i] += 1;
            for (int j = i+1; j <= k; j++) a[j] = a[i] + j-i;
        }
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
