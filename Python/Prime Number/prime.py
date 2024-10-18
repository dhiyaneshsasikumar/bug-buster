def is_prime(n):
    if n == 1:  
        return True 
   
    for i in range(2, n // 2):  
        if n % i == 0:
            return False
    return True

num = input("Enter a number: ")  

if is_prime(num):  
    print(f"{num} is a prime number.")
else:
    print(f"{num} is not a prime number.")