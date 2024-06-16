print("Name: Atul Rajput")
print("Roll No. : 2230158")
print()

class Animal:
    def sound(self):
        pass

class Dog(Animal):
    def sound(self):
        return "Woof!"

class Cat(Animal):
    def sound(self):
        return "Meow!"

class Cow(Animal):
    def sound(self):
        return "Moo!"

# Example usage:
animals = [Dog(), Cat(), Cow()]

for animal in animals:
    print(f"The {animal.__class__.__name__} makes a sound: {animal.sound()}")
