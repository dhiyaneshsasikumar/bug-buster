import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        float num1 = sc.next();  

        System.out.print("Enter the second number: ");
        float num2 = sc.next();  

        
        float addtion = num1 + num2; 
        float subtration = num1 - num2;  
        float multipliction = num1 * num2;  

        float division;
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = "undefined";  
        }

        
        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + addtion);  
        System.out.println(num1 + " - " + num2 + " = " + subtration); 
        System.out.println(num1 + " * " + num2 + " = " + multipliction); 

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + division);  
        } else {
            System.out.println("Division by zero is undefined.");
        }

        System.out.println("\nThank you for using the calculator!");
    }
}
