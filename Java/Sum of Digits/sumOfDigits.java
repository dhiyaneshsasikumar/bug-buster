import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.next(); 

        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is " + result);
    }
}