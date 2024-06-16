# Write a program with a function unique_list that takes a list of numbers as a parameter and return
# a new list with the unique list.

print("Name: Atul Rajput")
print("Roll No. 2230158")

def unique_list(numbers):
    unique_numbers = []

    for num in numbers:
        if num not in unique_numbers:
            unique_numbers.append(num)

    return unique_numbers

numbers = [1, 2, 3, 4, 2, 3, 5, 6, 1, 7, 8, 9, 7, 10]
unique_numbers = unique_list(numbers)

print("Original List:", numbers)
print("Unique List:", unique_numbers)