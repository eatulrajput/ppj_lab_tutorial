# Design a class hierarchy for different vehicles (e.g., Car, Truck, Motorcycle). Include methods to
# calculate mileage and display vehicle information.

print("Name: Atul Rajput")
print("Roll No. 2230158")
print()

class Vehicle:
def __init__(self, make, model, year):
self.make = make
self.model = model
self.year = year

def display_info(self):

print(f"Make: {self.make}")
print(f"Model: {self.model}")
print(f"Year: {self.year}")

class Car(Vehicle):
def __init__(self, make, model, year, mileage):
super().__init__(make, model, year)
self.mileage = mileage

def calculate_mileage(self):
return self.mileage

class Truck(Vehicle):
def __init__(self, make, model, year, mileage):
super().__init__(make, model, year)
self.mileage = mileage

def calculate_mileage(self):
return self.mileage

class Motorcycle(Vehicle):

def __init__(self, make, model, year, mileage):
super().__init__(make, model, year)
self.mileage = mileage

def calculate_mileage(self):
return self.mileage

car = Car("Toyota", "Corolla", 2020, 30) # Mileage in MPG
truck = Truck("Ford", "F-150", 2018, 20) # Mileage in MPG
motorcycle = Motorcycle("Harley-Davidson", "Sportster", 2019, 50) #
Mileage in MPG

print("Car Information:")
car.display_info()
print("Mileage (MPG):", car.calculate_mileage())

print("\nTruck Information:")
truck.display_info()
print("Mileage (MPG):", truck.calculate_mileage())

print("\nMotorcycle Information:")

motorcycle.display_info()
print("Mileage (MPG):", motorcycle.calculate_mileage())