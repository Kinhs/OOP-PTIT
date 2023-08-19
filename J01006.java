import java.util.Scanner;

public class J01006 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        long[] Fibonacci = new long[92];
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        for(int i = 2; i < 92; i++) {
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        }

        while(testNumber-->0) {
            int index = scanner.nextInt();
            System.out.println(Fibonacci[index-1]);
        }
    }
}
