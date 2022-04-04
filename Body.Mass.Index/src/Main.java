import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the kilo:");
		double kg = s.nextDouble();
		System.out.println("Enter the boy");
		double m = s.nextDouble();
		
		double bmi = kg/(m*m);
		System.out.println("Body mass index: " + bmi);
		
		if(bmi<18) {
			System.out.println("Skinny");
		}else if(bmi < 25) {
			System.out.println("Normal");
		}else if(bmi < 30) {
			System.out.println("Little fat");
		}else if(bmi < 35) {
			System.out.println("Fat");
		}else {
			System.out.println("Obese");
		}
	} 

}
