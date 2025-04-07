import java.util.Scanner;
class SpringSeason{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("month ");
        int month = input.nextInt();
        System.out.print("day ");
        int day = input.nextInt();
        if (month >= 3 && month <= 6) {
            if (month == 3 && day >= 20 && day <= 31) {
                System.out.println("It's a Spring Season");
            } else if (month == 4 && day >= 1 && day <= 30) {
                System.out.println("It's a Spring Season");
            } else if (month == 5 && day >= 1 && day <= 31) {
                System.out.println("It's a Spring Season");
            } else if (month == 6 && day >= 1 && day <= 20) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}