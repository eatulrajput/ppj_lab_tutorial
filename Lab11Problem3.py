# Define a base class Animal with a method sound() that prints the sound the animal makes. Create
# subclasses Dog and Cat that inherit from Animal and override the sound() method to print the
# specific sound each animal makes.

print("Name: Atul Rajput")
print("Roll No.: 2230158")
print()

class Animal:

def sound(self):
print("This animal makes a sound.")

class Dog(Animal):
def __init__(self):
print("A dog is created.")

def sound(self):
print("Woof!")

class Cat(Animal):
def __init__(self):
print("A cat is created.")

def sound(self):
print("Meow!")

# Example usage:

animal = Animal()
animal.sound()

print()

dog = Dog()
dog.sound()

print()

cat = Cat()
cat.sound()