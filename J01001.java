import java.util.Scanner;

public class J01001 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.print(0);
        } else System.out.print((a + b) * 2 + " " + a * b);
    }

}
