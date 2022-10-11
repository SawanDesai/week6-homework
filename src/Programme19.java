import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String using Uppercase");
        String line = scanner.nextLine();
        line= line.toLowerCase();
         System.out.println(line);
        scanner.close();

    }
}
