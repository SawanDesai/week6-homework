import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(n + "*" + i + "=" + n * i);
        }
        scanner.close();
    }
}
