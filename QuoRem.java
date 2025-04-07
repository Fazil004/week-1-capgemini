import java.util.Scanner;
public class QuoRem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number2: ");
        int num2 = input.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d%n", quotient, remainder, num1, num2);
    }
}