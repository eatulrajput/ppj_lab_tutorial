# Write a program to iterate through the first 10 numbers, and in each Print characters from a string
# that are present at an even index number. Accept a string from the user and display characters
# that are present at an even index number.

print("Name: Atul Rajput")
print("Roll No. 2230158")
user_string = input("Enter a string: ")
for num in range(10):
    if num < len(user_string):
        if num % 2 == 0:
            print(user_string[num])