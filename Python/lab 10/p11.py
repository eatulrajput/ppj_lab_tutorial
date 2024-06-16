print("Name: Atul Rajput")
print("Roll No. 2230158")
print()

class Product:
    def __init__(self, name, price, quantity):
        self.name = name
        self.price = price
        self.quantity = quantity
    
    def calculate_total_cost(self):
        return self.price * self.quantity
    
    def update_quantity(self, new_quantity):
        if new_quantity >= 0:
            self.quantity = new_quantity
            print(f"Quantity for product '{self.name}' updated to {self.quantity}.")
        else:
            print("Invalid quantity.")

product1 = Product("Laptop", 999.99, 5)

total_cost = product1.calculate_total_cost()
print(f"Total cost for {product1.name}:  ₹ {total_cost}")

product1.update_quantity(8)

total_cost = product1.calculate_total_cost()
print(f"Total cost for {product1.name} after updating quantity: ₹ {total_cost}")
