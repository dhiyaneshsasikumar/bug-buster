def factorial(n):
    if n = 0:  
        return 1
    return n * factorial(n - 1)

num = input("Enter a number: ")  
if num < 0:  
    print("Factorial not defined for negative numbers.")
else:
    result = factorial(num)
    print(f"Factorial of {num} is {result}")  