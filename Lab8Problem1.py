# Given two lists—one containing keys and the other containing values. Create a dictionary by pairing corresponding elements from both lists.

print("Name: Atul Rajput")
print("Roll No. 2230158")
def create_dictionary(keys, values):
    dictionary = dict(zip(keys, values))
    return dictionary

keys = ['a', 'b', 'c']
values = [1, 2, 3]

result_dict = create_dictionary(keys, values)
print(result_dict)