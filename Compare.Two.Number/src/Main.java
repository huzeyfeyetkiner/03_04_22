import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1 = s.nextInt();
		System.out.println("Enter the second value:");
		int num2 = s.nextInt();
		
		if(num1 > num2) {
			System.out.println("First value is bigger.");
		}else if(num1 < num2) {
			System.out.println("Second value is bigger.");
		}else {
			System.out.println("Entered values are equal.");
		}
		
	}

}
