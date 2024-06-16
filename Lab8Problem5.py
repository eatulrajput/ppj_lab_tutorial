# Create a list containing 25 integer type data. Using for loop and if-else condition print if the
# element is divisible by 3 or not.

print("Name: Atul Rajput")
print("Roll No. 2230158")

integer_list = [i for i in range(1, 26)]
for num in integer_list:
    if num % 3 == 0:
        print(f"{num} is divisible by 3.")
    else:
        print(f"{num} is not divisible by 3.")