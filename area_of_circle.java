import java.util.Scanner;

public class CircleAreaCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        CircleAreaCalculator calculator = new CircleAreaCalculator();
        double area = calculator.calculateArea(radius);

        System.out.printf("The area of the circle is: %.2f\n", area);

        scanner.close();
    }
}
