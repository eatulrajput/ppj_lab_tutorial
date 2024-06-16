# Write a program to show
# (a) Exit a loop using break

print("Name: Atul Rajput")
print("Roll No. 2230158")

print("Exiting a loop using break:")
for i in range(1, 11):
    if i == 5:
        print("Encountered 5, breaking the loop")
        break
    print("Current value:", i)