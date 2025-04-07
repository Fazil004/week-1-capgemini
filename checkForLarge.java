import java.util.Scanner;
class checkForLarge{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int a,b,c;
        System.out.println("enter a : ");
        a = input.nextInt();
        System.out.println("enter b : ");
        b = input.nextInt();
        System.out.println("enter c : ");
        c = input.nextInt();
        if((a>b)&&(a>c)){
            System.out.print("Is the first number the largest? Yes "+
            "\nIs the second number the largest? No"+
            "\nIs the third number the largest? No");
        }else if ((b>a)&&(b>c)){
            System.out.print("Is the first number the largest? No "+
            "\nIs the second number the largest? Yes"+
            "\nIs the third number the largest? No");
        }else if ((c>a)&&(c>b)){
            System.out.print("Is the first number the largest? No "+
            "\nIs the second number the largest? No"+
            "\nIs the third number the largest? Yes");
            
        }
    }
}