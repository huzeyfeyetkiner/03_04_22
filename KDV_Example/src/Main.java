import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the price:");
		double price = s.nextInt();
		
		double newPrice = (price * 18/100)+price;
		
		System.out.println("Price with KDV:"+newPrice);
		
	}

}
