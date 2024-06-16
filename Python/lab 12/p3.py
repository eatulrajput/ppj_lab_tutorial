print("Name: Atul Rajput")
print("Roll No. : 2230158")
print()

class Employee:
    def calculate_payment(self):
        pass

class HourlyEmployee(Employee):
    def __init__(self, hours_worked, hourly_rate):
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate
    
    def calculate_payment(self):
        return self.hours_worked * self.hourly_rate

class SalariedEmployee(Employee):
    def __init__(self, salary):
        self.salary = salary
    
    def calculate_payment(self):
        return self.salary


hourly_employee = HourlyEmployee(40, 20)
print("Payment for hourly employee:", hourly_employee.calculate_payment())

salaried_employee = SalariedEmployee(4000)
print("Payment for salaried employee:", salaried_employee.calculate_payment())
