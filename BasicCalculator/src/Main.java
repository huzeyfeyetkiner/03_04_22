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
		if(oper == '+') {
			result = num1 + num2;
		}else if(oper == '-') {
			result = num1 - num2;
		}else if(oper == '*') {
			result = num1 * num2;
		}else if(oper == '/') {
			result = num1 / num2;
		}else result = 0;
		
		
		System.out.printf("The result of the operation = %.2f",result);
		
		
	}

}
