import java.io.*;
import java.util.*;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b  = sc.nextInt();
		int c = sc.nextInt();

		if(a<b && b>c)
			System.out.println(b);
		else if(a<c)
			System.out.println(c);
		else
			System.out.println(a);
		}
}