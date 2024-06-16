# Write a programme that asks the user for number (int) . It computes the average of a number &
# allows the user to enter -1 to quit.

print("Name: Atul Rajput")
print("Roll No. 2230158")
total = 0
count = 0
while True:

    number = int(input("Enter a number (enter -1 to quit): "))
    if number == -1:
        break
    total += number
    count += 1
    if count > 0:
        average = total / count
        print(f"The average of the numbers entered is: {average}")
    else:
        print("No numbers were entered.")