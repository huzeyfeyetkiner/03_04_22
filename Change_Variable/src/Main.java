import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first variable:");
		int number1 = s.nextInt();
		System.out.println("Enter the second variable");
		int number2 = s.nextInt();
		
		int temporary = number1;
		number1 = number2;
		number2 = temporary;
		System.out.println("number1:"+number1+"\n"+"number2:"+number2);
		
		
	}

}
