import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            System.out.println(solution(s));
        }
    }

    public static String solution(String s) {
        int l = s.length();
        if (s.charAt(0) != '8' || s.charAt(l-1) != '8') return "NO";
        Integer sum = 16;
        for (int i = 1; i * 2 < l; i++) {
            if (s.charAt(i) != s.charAt(l-i-1)) return "NO";
            sum += 2 * (s.charAt(i) - '0');
        }
        if (l % 2 == 1) sum -= s.charAt((int)(l/2)) - '0';
        if (sum % 10 == 0) return "YES";
        return "NO";
    }
}
