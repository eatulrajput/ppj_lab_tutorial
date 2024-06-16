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
        return math.pi * self.radius ** 2

class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width
    
    def area(self):
        return self.length * self.width

class Triangle(Shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height
    
    def area(self):
        return 0.5 * self.base * self.height

circle = Circle(5)
print("Area of circle:", circle.area())

rectangle = Rectangle(4, 6)
print("Area of rectangle:", rectangle.area())

triangle = Triangle(3, 8)
print("Area of triangle:", triangle.area())
