/*
What will be the output of the following code snippet?
*/

public class SwitchCase {
    public static void main(String[] args) {
        int num = 6;
        switch(num) {
            case 3:
                System.out.println("Three");
                break;
            case 6:
                System.out.print("Six");
            case 9:
                System.out.println("Nine"); 
                break; 
            default:
                System.out.println("Default");
        }
    }
}
