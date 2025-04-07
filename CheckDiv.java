import java.util.Scanner;
class CheckDiv{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("enter number : ");
        int num = input.nextInt();
        if (num%5==0){
            System.out.println("Is the number "+num+" divisible by 5? yes"
);
        } else {
            System.out.println("Is the number "+num+" divisible by 5? No");
        }
    }
}