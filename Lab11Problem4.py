# Create a base class Person with attributes name and age, and a method introduce() to print the
# name and age of the person. Create a subclass Student that inherits from Person and adds an
# attribute student_id. Implement a method introduce() in Student to include the student ID along
# with the name and age.

print("Name: Atul Rajput")
print("Roll No.: 2230158")
print()
class Person:
def __init__(self, name, age):
self.name = name
self.age = age
def introduce(self):
print(f"Name: {self.name}")
print(f"Age: {self.age}")

class Student(Person):
def __init__(self, name, age, student_id):
super().__init__(name, age)
self.student_id = student_id
def introduce(self):
super().introduce()
print(f"Student ID: {self.student_id}")

person = Person("Astha Sharma", 20)

person.introduce()
print()
student = Student("Akshara Verma", 20, "S12345")
student.introduce()