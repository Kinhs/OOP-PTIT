import java.util.ArrayList;
import java.util.Scanner;


public class J02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (n-- > 0) {
            int x = scanner.nextInt();
            int l = a.size();
            if (l == 0) {
                a.add(x);
            } else if ((a.get(l-1) + x) % 2 == 0) a.remove(l-1);
            else a.add(x);
        }
        System.out.print(a.size());
    }
}
