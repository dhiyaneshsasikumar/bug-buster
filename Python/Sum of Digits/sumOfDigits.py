def sum_of_digits(n):
    sum = 0
    while n != 0:
        sum += n % 10
        n //= 10
    return sum

num = input("Enter a number: ") 
result = sum_of_digits(num)  
print(f"Sum of digits of {num} is {result}")