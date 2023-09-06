import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] a = new int[26];
        char[] b = s.toCharArray();
        int cnt = 0;
        for (char i : b) {
            if (a[i-'a'] == 0) {
                cnt++;
                a[i-'a'] = 1;
            }
        }
        System.out.println(cnt);
    }
}
