import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n = 0) 
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.next(); 
        if (num < 0)  
            System.out.println("Factorial not defined for negative numbers.");
        else {
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is " + result);
        }
    }
}