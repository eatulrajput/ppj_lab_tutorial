# Calculate the multiplication and sum of two numbers: Given two integer numbers, return their
# product only if the product is equal to or lower than 1000. Otherwise, return their sum.

print("Name: Atul Rajput")
print("Roll No. 2230158")

def calculate_product_or_sum(num1, num2):
    product = num1 * num2
    if product <= 1000:
        return product
    else:
        return num1 + num2

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

result = calculate_product_or_sum(num1, num2)
print("Result:", result)