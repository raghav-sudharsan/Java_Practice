import java.io.*;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		int sum = 0;
		while (num > 0) {
			int r = num%10;
			sum += r*r*r;
			num = num/10;
		}
		
		if (sum == number) 
			System.out.println("Amstrong number");
		else
			System.out.println("Not an armstrong number");
	}
}
