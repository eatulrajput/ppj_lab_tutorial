# Write a programme with function get_factor that takes an integer as a parameter and return a list
# of factors of that number.

print("Name: Atul Rajput")
print("Roll No. 2230158")

def get_factors(number):
    factors = []
    for i in range(1, number + 1):
        if number % i == 0:
            factors.append(i)
    return factors
number = int(input("Enter an integer to find its factors: "))
result = get_factors(number)
print(f"The factors of {number} are: {result}")