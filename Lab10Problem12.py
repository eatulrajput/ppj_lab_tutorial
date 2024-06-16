# Design a class hierarchy for different employees (e.g., Manager, Developer, Tester).
# Include methods to calculate salary and display employee details.

print("Name: Atul Rajput")
print("Roll No. 2230158")
print()

class Employee:
def __init__(self, name, employee_id):
self.name = name
self.employee_id = employee_id

def display_details(self):
print(f"Name: {self.name}")
print(f"Employee ID: {self.employee_id}")

class Manager(Employee):
def __init__(self, name, employee_id, salary, bonus):
super().__init__(name, employee_id)
self.salary = salary
self.bonus = bonus

def calculate_salary(self):
return self.salary + self.bonus

def display_details(self):
super().display_details()
print(f"Position: Manager")
print(f"Salary: {self.salary}")
print(f"Bonus: {self.bonus}")

class Developer(Employee):
def __init__(self, name, employee_id, salary, language):
super().__init__(name, employee_id)
self.salary = salary
self.language = language

def calculate_salary(self):
return self.salary

def display_details(self):
super().display_details()
print(f"Position: Developer")
print(f"Salary: {self.salary}")
print(f"Programming Language: {self.language}")

class Tester(Employee):
def __init__(self, name, employee_id, salary, experience):
super().__init__(name, employee_id)
self.salary = salary
self.experience = experience

def calculate_salary(self):
return self.salary

def display_details(self):
super().display_details()

print(f"Position: Tester")
print(f"Salary: {self.salary}")
print(f"Experience: {self.experience} years")

# Example usage:
manager = Manager("Aaditya Singh", "M001", 80000, 15000)
developer = Developer("Sushmita Singh", "D001", 60000, "Python")
tester = Tester("Rohit Singh", "T001", 55000, 3)

# Display employee details and calculate salary
manager.display_details()
print("Total Salary:", manager.calculate_salary())
print()

developer.display_details()
print("Total Salary:", developer.calculate_salary())
print()

tester.display_details()
print("Total Salary:", tester.calculate_salary())