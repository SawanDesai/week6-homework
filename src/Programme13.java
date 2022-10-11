import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {

        int average,a,b,c;
        // average of three numbers a+b+c/3
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number ");
         a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();
        System.out.println("enter third number");
        c = scanner.nextInt();
        average = ((a+b+c)/3);
        System.out.println("Average of three number:"+ average);
        scanner.close();

    }
}
