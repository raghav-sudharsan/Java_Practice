import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void out(int n) {
        if(n%3 == 0 && n%5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else
            System.out.println("Not divisible by both 3 and 5");
    }
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        //check the first number
        num = scanner.nextInt();
        out(num);
        

        //check the second number
        num = scanner.nextInt();
        out(num);
        
    }
}