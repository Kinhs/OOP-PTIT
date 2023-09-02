import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            System.out.println(solve(s));
        }
    }
    public static String solve(String s) {
        if (s.charAt(0) == '0') return "INVALID";
        int cnteven = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return "INVALID";
            if ((s.charAt(i) - '0') % 2 == 0) cnteven++;
        }
        if (s.length() % 2 == 0 && cnteven > s.length() - cnteven) return "YES";
        if (s.length() % 2 == 1 && cnteven < s.length() - cnteven) return "YES";
        return "NO";
    }
}
