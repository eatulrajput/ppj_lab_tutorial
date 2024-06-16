# Write a program to iterate through the list and find the even number & its count.
print("Name: Atul Rajput")
print("Roll No. 2230158")
def count_even_numbers(lst):
    even_count = 0
    for num in lst:
        if num % 2 == 0:
            even_count += 1
            return even_count
my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
even_count = count_even_numbers(my_list)
print("Number of even numbers:", even_count)