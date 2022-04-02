import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("long of the first side:");
		int side1 = s.nextInt();
		System.out.println("long of the second side: ");
		int side2 = s.nextInt();
		
		int area = side1*side2;
		int perimeter = (side1*2) + (side2*2);
		
		System.out.println("Area:"+area+"\n"+"Perimeter:"+perimeter);
	}

}
