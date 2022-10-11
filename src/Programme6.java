import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        // area = pi * r* r
        double radius, area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius :");
        radius = scanner.nextDouble();
        //area = pai * r * r;
        area = Math.PI * radius * radius;
        System.out.println("area of a circle :" + area);
        scanner.close();

    }
}
