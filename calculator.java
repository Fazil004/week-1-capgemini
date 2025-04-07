import java.util.Scanner;
class calculator{
    public static void main(String[] args){
	float var1,var2;
	Scanner input = new Scanner(System.in);
	System.out.print("enter var1 : ");
	var1 = input.nextInt();
	System.out.print("enter var2 : ");
	var2 = input.nextInt();
	float addition = var1 + var2;
	float subtraction = var1-var2;
	float multiply = var1*var2;
	float division = (var1)/(var2);
	System.out.println(" The addition, subtraction, multiplication, and division value of 2 numbers "+var1+" and "+var2+" is "+ addition +" , "+ subtraction+" , "+ multiply+" , "+ division);
    }
}