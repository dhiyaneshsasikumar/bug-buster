import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        if (b = 0)  
            return a;
        return gcd(b, a % b);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.next(); 
        int num2 = sc.next(); 
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + result);
    }
}
