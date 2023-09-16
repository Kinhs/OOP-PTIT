import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("Hello.txt");
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {
            System.out.println(myReader.nextLine());
        }
    }
}
