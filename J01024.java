import java.util.Scanner;

public class J01024 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String xau = scanner.nextLine();
            System.out.println(soTamPhan(xau));
        }
    }

    public static String soTamPhan(String xau) {

        for (int i = 0; i < xau.length(); i++) {
            if (xau.charAt(i) != '0' && xau.charAt(i) != '1' && xau.charAt(i) != '2') return "NO";
        }
        return "YES";
    }
}
