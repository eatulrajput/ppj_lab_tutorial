# Write a program to show
# (b) Exit a loop using Continue

print("Name: Atul Rajput")
print("Roll No. 2230158")
print("\nExiting a loop using continue:")
for i in range(1, 11):

    if i % 2 == 0:
        print("Skipping even number:", i)
        continue
    print("Current value:", i)