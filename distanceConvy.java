import java.util.Scanner;
class distanceConvy{
    public static void main(String[] args){
	float distanceInFeet;
	Scanner input = new Scanner(System.in);
	System.out.print("enter distance in feet : ");
	distanceInFeet = input.nextFloat();
	float distanceInYard = distanceInFeet/3;
	float distanceInMile = distanceInYard/1760;
	System.out.print("The distance in yards is "+distanceInYard+" while the distance in miles is "+distanceInMile);
    }
}