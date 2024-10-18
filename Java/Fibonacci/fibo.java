import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n) {
        int t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series: " + t1 + ", " + t2);

        for (int i = 3; i <= n; i++) {
            int nextTerm = t1 + t2;
            System.out.print(", " + nextTerm);
            t1 = t2;
            t2 = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.next();  

        if (n < 1) 
            System.out.println("Enter a positive number.");
        else
            fibonacci(n);
    }
}