import java.util.Scanner;

public class J01002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            scanner.nextLine();
            long n = scanner.nextInt();
            System.out.println(n*(n+1)/2);
        }
    }
}
