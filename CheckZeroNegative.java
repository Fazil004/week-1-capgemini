import java.util.Scanner;
class CheckZeroNegative{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double value ;
        double variable = 0.0;
        System.out.print("Value ");
        value =  input.nextDouble();
        while (true){
            if (value>0){
                variable+=value;
                System.out.println("please input again Enter zero to stop");
                value =  input.nextDouble();
            }else if ((value==0)||(value<0)){
                break;
            }
        }
        System.out.println("Total sum: " + variable);
        input.close();
    }
}