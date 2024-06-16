print("Name: Atul Rajput")
print("Roll No.: 2230158")
print()

class Shape:
    def __init__(self, color, filled):
        self.color = color
        self.filled = filled
    
    def get_info(self):
        print(f"Color: {self.color}")
        print(f"Filled: {'Yes' if self.filled else 'No'}")


class Rectangle(Shape):
    def __init__(self, color, filled, length, width):
        super().__init__(color, filled)
        self.length = length
        self.width = width
    
    def calculate_area(self):
        return self.length * self.width

rectangle = Rectangle("Red", True, 5, 4)
rectangle.get_info()
print("Area:", rectangle.calculate_area())
