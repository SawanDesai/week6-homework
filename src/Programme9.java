import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {

        String txt, lowercase;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sentence using uppercase ");
        txt = scanner.nextLine();
        lowercase = txt.toLowerCase();
        System.out.println("your answer is: " + lowercase);
        scanner.close();
    }

}
