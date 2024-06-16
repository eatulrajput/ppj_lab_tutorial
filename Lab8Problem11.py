# Write a program to find the minimum value of a list of numbers 5,3,8,-1,- 2.2,0 (Don’t use built
# in function).

print("Name: Atul Rajput")
print("Roll No. 2230158")
def find_minimum(lst):

    if not lst:
        return None
    min_value = lst[0]
    for num in lst[1:]:
        if num < min_value:
            min_value = num
            return min_value
numbers = [5, 3, 8, -1, -2.2, 0]
min_value = find_minimum(numbers)
print("Minimum value:", min_value)