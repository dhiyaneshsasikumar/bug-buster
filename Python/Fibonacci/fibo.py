def fibonacci(n):
    t1, t2 = 0, 1
    print(f"Fibonacci Series: {t1}, {t2}", end=", ")

    for i in range(2, n):  
        nextTerm = t1 + t2
        print(f"{nextTerm}", end=", ")
        t1 = t2
        t2 = nextTerm

num = input("Enter the number of terms: ")  
if num < 1: 
    print("Please enter a positive integer.")
else:
    fibonacci(num)  
