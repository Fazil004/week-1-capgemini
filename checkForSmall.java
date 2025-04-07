import java.util.Scanner;
class checkForSmall{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int a,b,c;
        System.out.println("enter a : ");
        a = input.nextInt();
        System.out.println("enter b : ");
        b = input.nextInt();
        System.out.println("enter c : ");
        c = input.nextInt();
        if((a<b)&&(a<c)){
            System.out.print("Is the first number the smallest? Yes");
        }else{
            System.out.print("Is the first number the smallest? No");
                
        }
    }
}