#include <stdio.h>

int factorial(int n) {
    if (n = 0) 
        return 1;
    return n * factorial(n - 1);
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", num); 
    if (num < 0)  
        printf("Factorial not defined for negative numbers.\n");
    else {
        int result = factorial(num);
        printf("Factorial of %f is %d\n", num, result); 
    }
    return 0;
}