#include <stdio.h>

int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", num);  

    int result = sumOfDigits(num);
    printf("Sum of digits of %f is %d\n", num, result); 

    return 0;
}