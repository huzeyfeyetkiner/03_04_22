import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first variable:");
		int number1 = s.nextInt();
		System.out.println("Enter the second variable");
		int number2 = s.nextInt();
		// 1 = 10, 2=20
		number1 = number1 + number2; //30
		number2 = number1 - number2; //10
		number1 = number1 - number2;
		
		System.out.println(number1 + " " + number2);
		
	}

}
