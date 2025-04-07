import java.util.Scanner;
class VoteAge{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Age : ");
        int age = input.nextInt();
        if (age>=18){
            System.out.printf("The person can vote.");
        }else {
            System.out.println("The person cannot vote.");
        }
        
    }
}