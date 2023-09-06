import java.util.Scanner;

public class J03040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            if (check(s.substring(5))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String a) {
        char[] l = a.toCharArray();
        if (l[0] < l[1] && l[1] < l[2] && l[2] < l[4] && l[4] < l[5]) return true;
        if (l[0] == l[1] && l[1] == l[2] && l[4] == l[5]) return true;
        for (char i : l){
            if (i=='.') continue;
            if (i != '6' && i != '8') return false;
        }
        return true;
    }
}
