# Write a programme that uses a while loop to test whether user input a password "Secret" other
# wise print " Your password is incorrect".

print("Name: Atul Rajput")
print("Roll No. 2230158")
correct_password = "Secret"
user_password = input("Enter the password: ")
while user_password != correct_password:
    print("Your password is incorrect.")
    user_password = input("Enter the password again: ")
print("Access granted!")