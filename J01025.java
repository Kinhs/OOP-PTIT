import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class J01025 {

    public static int[] x = new int[4], y = new int[4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int a = Math.max(x[3] - x[0], y[3] - y[0]);
        System.out.print(a*a);
    }

}
