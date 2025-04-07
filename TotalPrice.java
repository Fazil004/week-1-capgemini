import java.util.Scanner;
class TotalPrice{
    public static void main(String[] args){
	int unitPrice,quantity;
	Scanner input = new Scanner(System.in);
	System.out.print("enter unitPrice : ");
	unitPrice = input.nextInt();
	System.out.print("enter quantity : ");
	quantity = input.nextInt();
	int totalPurchasePrice = unitPrice * quantity;
	System.out.print("The total purchase price is INR "+totalPurchasePrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
