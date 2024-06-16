# Implement a class hierarchy for different shapes (e.g., Circle, Square, Triangle). Include methods
# to calculate area and perimeter for each shape.

import math
print("Name: Atul Rajput")
print("Roll No. 2230158")
print()
class Shape:
def area(self):

pass
def perimeter(self):
pass

class Circle(Shape):
def __init__(self, radius):
self.radius = radius
def area(self):
return math.pi * self.radius**2
def perimeter(self):
return 2 * math.pi * self.radius

class Square(Shape):
def __init__(self, side):
self.side = side

def area(self):
return self.side**2
def perimeter(self):
return 4 * self.side
class Triangle(Shape):
def __init__(self, side1, side2, side3):
self.side1 = side1

self.side2 = side2
self.side3 = side3
def area(self):
s = (self.side1 + self.side2 + self.side3) / 2
return math.sqrt(s * (s - self.side1) * (s - self.side2) *
(s - self.side3))
def perimeter(self):
return self.side1 + self.side2 + self.side3

circle = Circle(5)
print("Circle - Area:", circle.area())
print("Circle - Perimeter:", circle.perimeter())
square = Square(4)
print("Square - Area:", square.area())
print("Square - Perimeter:", square.perimeter())
triangle = Triangle(3, 4, 5)
print("Triangle - Area:", triangle.area())
print("Triangle - Perimeter:", triangle.perimeter())