import java.net.SocketOption;
import java.util.Scanner;

public class J01003 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) System.out.print("VSN");
            else System.out.print("VN");
        } else System.out.printf("%.2f", -1*b/a);
    }
}
