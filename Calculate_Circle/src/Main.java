import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius = s.nextInt();
		int circle = 2*3*radius;
		
		System.out.println("Circumference of the circle:"+circle);
		
	}

}
