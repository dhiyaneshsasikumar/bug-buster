import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n == 1) 
            return true;  

        for (int i = 2; i < n / 2; i++) { 
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.next(); 

        if (isPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}