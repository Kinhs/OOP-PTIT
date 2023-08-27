import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int cnt1 = 0;
            for (int j = 0; j < 3; j++) {
                int x = scanner.nextByte();
                if (x == 1) cnt1++;
            }
            if (cnt1 > 1) cnt++;
        }
        System.out.println(cnt);
    }
}
