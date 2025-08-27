/*Arithmetic operation
Write a program that takes two numbers and an operator (+, -, *, /) as input. Use a switch statement to perform the corresponding arithmetic operation and print the result.

Sample 1:
Input
Output
5 2 +
7
*/

import java.util.Scanner;
public class SwitchArithmatic
{
    public static void main(String[] args) 
    {
        //your code goes InheritableThreadLocal
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char c = s.next().charAt(0);
        
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
                
        }
       
        
    }
}