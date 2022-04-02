import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the distance(km):");
		int distance = s.nextInt();
		System.out.println("How long the road gonna take(hour):");
		int time = s.nextInt();
		
		int avarageSpeed = distance/time;
		
		System.out.println("Avarage speed:"+avarageSpeed);
		
		
	}

}
