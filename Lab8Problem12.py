# Write a programme to iterate over a list of strings and check whether a particular word is in or
# not ?

print("Name: Atul Rajput")
print("Roll No. 2230158")
def check_word_in_list(word, string_list):
    for string in string_list:
        if word in string:

            return True
    return False

string_list = ["apple", "banana", "orange", "grape"]

word_to_check = input("Enter the word to check: ")

if check_word_in_list(word_to_check, string_list):
    print(f"The word '{word_to_check}' is present in the list.")
else:
    print(f"The word '{word_to_check}' is not present in the list.")