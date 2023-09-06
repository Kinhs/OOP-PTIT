import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char[] a = scanner.next().toCharArray();
            if (check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(char[] a) {
        int cnt = 0;
        for (int i = 0; i*2 < a.length; i++) {
            if (a[i] != a[a.length-i-1]) {
                cnt++;
                if (cnt > 1) return false;
            }
        }
        if (a.length % 2 == 1 && cnt == 0) cnt++;
        return cnt == 1;
    }
}
