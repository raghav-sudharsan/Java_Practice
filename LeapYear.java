import java.util.*;

public class LeapYear {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a%4==0)
		System.out.println("LeapYear");
		else
		System.out.println("Not LeapYear");

	}
	
}
