import java.util.Scanner;
class NaturalNum{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        if (num>=0){
            int nsum = num*(num+1)/2;
            System.out.printf("The sum of %d natural numbers is %d%n",num,nsum);
        }else {
            System.out.println("The number "+num+" is not a natural number");
        }
        
    }
}