print("Name: Atul Rajput")
print("Roll No.: 2230158")
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
    def __init__(self, make, model, year, mileage, mileage_unit):
        super().__init__(make, model, year)
        self.mileage = mileage
        self.mileage_unit = mileage_unit
    
    def display_info(self):
        super().display_info()
        print(f"Mileage: {self.mileage} {self.mileage_unit}")

car = Car("Toyota", "Camry", 2022, 50000, "miles")
car.display_info()

