import java.io.*;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] mark = new int[1000];
        while (sc.hasNext()) {
            int i = Integer.parseInt(sc.next());
            mark[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (mark[i] > 0) System.out.printf("%d %d\n",i, mark[i]);
        }
    }
}
