# Write a programme to create a dictionary of three students with their details like name,grades &
# attendance of 5 subjects in list. Then create another dictionary which is having roll no as keys
# and name of the students as values. Write another programme to get average of all the marks.

print("Name: Atul Rajput")
print("Roll No. 2230158")

def calculate_average(marks):
    total_marks = sum(marks)
    average = total_marks / len(marks)
    return average

students_details = {
101: {"name": "Alice", "grades": [85, 90, 92, 88, 89], "attendance": [True,
True, True, True, False]},
102: {"name": "Bob", "grades": [78, 85, 80, 79, 82], "attendance": [True,
True, True, True, True]},
103: {"name": "Charlie", "grades": [90, 88, 92, 85, 87], "attendance": [True,
True, True, True, True]}
}

roll_number_to_name = {roll_no: details["name"] for roll_no, details in
students_details.items()}

def get_average_marks(students_details):
    averages = {}
    for roll_no, details in students_details.items():
        average = calculate_average(details["grades"])
        averages[details["name"]] = average
    return averages

average_marks = get_average_marks(students_details)

print("Average marks of all students:")
for name, average in average_marks.items():
    print(f"{name}: {average:.2f}")