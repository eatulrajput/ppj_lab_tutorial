print("Name: Atul Rajput")
print("Roll No. 2230158")
print()
class Student:
    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade
    
    def display_info(self):
        print("Student Information:")
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Grade: {self.grade}")
student1 = Student("Atul Rajput", 19, "10 GPA")
student1.display_info()
