num1 = input("Enter the first number: ")  
num2 = input("Enter the second number: ")  

addtion = num1 + num2  
subtration = num1 - num2  
multipliation = num1 * num2  
divison = num1 / num2 if num2 != 0 else "undefined" 

print("\nResults:")
print(f"{num1} + {num2} = {addtion}")
print(f"{num1} - {num2} = {subtration}")
print(f"{num1} * {num2} = {multipliation}")
print(f"{num1} / {num2} = {divison}")

print("\nThank you for using the calculator!")