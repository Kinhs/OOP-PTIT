import java.util.Scanner;

public class J03006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            System.out.println(solution(s));
        }
    }

    public static String solution(String s) {
        for (int i = 0; i*2 <= s.length(); i++) {
            if ((int)s.charAt(i) % 2 != 0) return "NO";
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return "NO";
        }
        return "YES";
    }
}
