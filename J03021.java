import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int l = s.length();
            int[] a = new int[l];
            for (int i = 0; i < l; i++) {
                a[i] = to_int(s.charAt(i));
            }
            if (check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static int to_int(char k) {
        char c = Character.toUpperCase(k);
        if (c >= 'A' && c <= 'C') return 2;
        if (c >= 'D' && c <= 'F') return 3;
        if (c >= 'G' && c <= 'I') return 4;
        if (c >= 'J' && c <= 'L') return 5;
        if (c >= 'M' && c <= 'O') return 6;
        if (c >= 'P' && c <= 'S') return 7;
        if (c >= 'T' && c <= 'V') return 8;
        if (c >= 'W' && c <= 'Z') return 9;
        return 0;
    }

    public static boolean check(int[] a) {
        for (int i = 0; i*2 < a.length; i++) {
            if (a[i] != a[a.length-i-1]) return false;
        }
        return true;
    }
}
