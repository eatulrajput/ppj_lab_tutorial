# Using a while loop, verify if the number A is purely divisible by number B and if so then how
# many times it can be divisible.

print("Name: Atul Rajput")
print("Roll No. 2230158")

def count_divisions(a, b):
    count = 0
    while a % b == 0:
        a /= b
        count += 1
        return count
a = int(input("Enter the number A: "))
b = int(input("Enter the number B: "))

if a % b == 0:
    times_divisible = count_divisions(a, b)
    print(f"{a} is purely divisible by {b} and can be divided {times_divisible}
    times.")
else:
    print(f"{a} is not purely divisible by {b}.")