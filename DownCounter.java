import java.util.Scanner;
class DownCounter{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Value ");
        int value = input.nextInt();
        int count = value;
        while (count>0){
            System.out.println(count);
            count=count-1;
        }
        
    }
}