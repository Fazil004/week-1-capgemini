import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();
        double areaCm = 0.5 * baseCm * heightCm;
        double areaIn = areaCm / (2.54 * 2.54); 
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn, areaCm);
        scanner.close();
    }
}