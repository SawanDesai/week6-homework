import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
// write a programme to calculate area of a triangle  area = B*H /2
 // area of a triangle = (base x height)/2
double area,base, height;
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base");
        base = scanner.nextDouble();
        System.out.println("Enter the height");
        height = scanner.nextDouble();
        area = ((base * height)/2);
        System.out.println("Area of a Triangle :"+ area);
        scanner.close();
    }
}
