print("Name: Atul Rajput")
print("Roll No. : 2230158")
print()

import math

class Shape:
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
    
    def area(self):
        if self.radius <= 0:
            raise ValueError("Radius must be a positive number.")
        return math.pi * self.radius ** 2

class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width
    
    def area(self):
        if self.length <= 0 or self.width <= 0:
            raise ValueError("Length and width must be positive numbers.")
        return self.length * self.width

class Triangle(Shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height
    
    def area(self):
        if self.base <= 0 or self.height <= 0:
            raise ValueError("Base and height must be positive numbers.")
        return 0.5 * self.base * self.height

def get_positive_number(prompt):
    while True:
        try:
            value = float(input(prompt))
            if value <= 0:
                print("Please enter a positive number.")
                continue
            return value
        except ValueError:
            print("Invalid input. Please enter a number.")

try:
    shape_type = input("Enter shape type (circle/rectangle/triangle): ").lower()

    if shape_type == "circle":
        radius = get_positive_number("Enter the radius of the circle: ")
        shape = Circle(radius)
    elif shape_type == "rectangle":
        length = get_positive_number("Enter the length of the rectangle: ")
        width = get_positive_number("Enter the width of the rectangle: ")
        shape = Rectangle(length, width)
    elif shape_type == "triangle":
        base = get_positive_number("Enter the base of the triangle: ")
        height = get_positive_number("Enter the height of the triangle: ")
        shape = Triangle(base, height)
    else:
        print("Invalid shape type. Please enter circle, rectangle, or triangle.")
        exit()

    area = shape.area()
    print(f"The area of the {shape_type} is: {area:.2f}")
except ValueError as ve:
    print("Error:", ve)
except Exception as e:
    print("An error occurred:", e)
