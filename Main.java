/*Positive and Negative
Write a program to check whether the three given numbers as input are Positive, Negative, or Zero.

Sample 1:
Input
Output
20  
0  
-95
Positive  
Zero  
Negative*/

import java.util.Scanner;

public class Main 
{
    public static void print(int num) {
        if (num > 0)
        System.out.println("Positive");
        else if (num == 0)
        System.out.println("Zero");
        else
        System.out.println("Negative");
        
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt(); // input first number
        // Check first number
        print(num);
        
        
        
        num = scanner.nextInt(); // input second number
        // Check second number
        print(num);
        
        
        num = scanner.nextInt(); // input third number
        // Check third number
        print(num);
        
        
    }
}