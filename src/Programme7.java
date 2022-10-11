import java.util.Scanner;
//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C

public class
Programme7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 32;
        double celsius;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        celsius = ((fahrenheit - c) * a) / b;

        System.out.println("Covert value in celsius : " + celsius);
        scanner.close();
    }
}
