# Create a list of length 10 of your choice containing multiple types of data. Using for loop print
# the element and its data type.

print("Name: Atul Rajput")
print("Roll No. 2230158")
my_list = [10, "hello", 3.14, True, [1, 2, 3], {'a': 1, 'b': 2}, None, (4, 5),
{'x', 'y', 'z'}, bytearray(b'bytes')]
for element in my_list:
    print(f"Element: {element}, Data Type: {type(element)}")