import java.util.Scanner;
class SideOfSq{
    public static void main (String[] args){
	float perimeter;
	Scanner input = new Scanner (System.in);
	System.out.print("enter perimeter : ");
	perimeter = input.nextFloat();
	float side = perimeter/4;
	System.out.print("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}