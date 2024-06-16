# Write a program that compares two numbers and prints whether they are equal, not equal, greater
# than, or less than each other.

print("Name: Atul Rajput")
print("Roll No. 2230158")
def compare_numbers(num1, num2):
    if num1 == num2:
        print("The numbers are equal.")
    elif num1 != num2:
        print("The numbers are not equal.")
    elif num1 > num2:
     print("The first number is greater than the second number.")
    else:
        print("The first number is less than the second number.")
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
compare_numbers(num1, num2) 