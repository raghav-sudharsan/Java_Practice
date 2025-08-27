/*Vowel or Consonant
Create a program that takes a lowercase English alphabetic character as input and uses a switch statement to determine if it's a vowel or consonant.

Sample 1:
Input
Output
i
Vowel */
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		
		switch (a) {
		    case 'a':
		    case 'e':
		    case 'i':
		    case 'o':
		    case 'u':
		        System.out.println("Vowel");
		        break;
		    default:
		        System.out.println("Consonant");
		  
		}

	}
}
