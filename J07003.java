import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        if (s.length() == 1) {
            System.out.println(s);
            return;
        }
        while (s.length() > 1) {
            int index = s.length() / 2;
            BigInteger fhalf = new BigInteger(s.substring(0, index));
            BigInteger lhalf = new BigInteger(s.substring(index));
            BigInteger sum = fhalf.add(lhalf);
            s = sum.toString();
            System.out.println(s);
        }
    }
}
