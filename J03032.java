import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            String[] a = s.split(" ");
            for (String string : a) {
                String temp = new StringBuilder(string).reverse().toString();
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
