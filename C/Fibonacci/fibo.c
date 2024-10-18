#include <stdio.h>

void fibonacci(int n) {
    int t1 = 0, t2 = 1, nextTerm;
    printf("Fibonacci Series: %d, %d, ", t1, t2);

    for (int i = 3; i <= n; ++i) {
        nextTerm = t1 + t2;
        printf("%d, ", nextTerm);
        t1 = t2;
        t2 = nextTerm;
    }
}

int main() {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", n);  
    if (n < 2) 
        printf("Enter a positive number greater than 1.\n");
    else
        fibonacci(n);
    return 0;
}