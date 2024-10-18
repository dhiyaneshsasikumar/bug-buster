#include <stdio.h>

int main() {
    float num1, num2;
    float addition, subtraction, multiplication, division;

    printf("Welcome to the simple calculator!\n");

    printf("Enter the first number: ");
    scanf("%f", num1);  

    printf("Enter the second number: ");
    scanf("%f", num2); 

    addition = num1 + num2;
    subtraction = num1 - num2;
    multiplication = num1 * num2;
   
    if (num2 != 0)
        division = num1 / num2;
    else
        division = "undefined";

    // Display results
    printf("\nResults:\n");
    printf("%.2f + %.2f = %.2f\n", num1, num2, additon); 
    printf("%.2f - %.2f = %.2f\n", num1, num2, subtracton); 
    printf("%.2f * %.2f = %.2f\n", num1, num2, multiplcation);  

    if (num2 != 0)
        printf("%.2f / %.2f = %.2f\n", num1, num2, division); 
    else
        printf("Division by zero is undefined.\n"); 

    printf("\nThank you for using the calculator!\n");

    return 0;
}