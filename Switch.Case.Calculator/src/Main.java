import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		double num1 = s.nextDouble();
		System.out.println("Enter the number2:");
		double num2 = s.nextDouble();
		System.out.println("Choose the operation( + - * /)");
		char oper = s.next().charAt(0);
		double result = 0;
		
		switch(oper) {
			case '+': 
				result = num1 + num2;
				break;
			case '-': 
				result = num1 - num2;
				break;
			case '*': 
				result = num1 * num2;
				break;
			case '/': 
				result = num1 / num2;
				break;
			default:
				result = 0;
				break;
		}	
		System.out.printf("The result of the operation = %.2f",result);
	}

}
