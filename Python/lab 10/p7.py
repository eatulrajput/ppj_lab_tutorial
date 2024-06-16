print("Name: Atul Rajput")
print("Roll No. 2230158")
print()

class Book:
    def __init__(self, title, author, price):
        self._title = title
        self._author = author
        self._price = price
    
    def set_details(self, title, author, price):
        self._title = title
        self._author = author
        self._price = price
    
    def get_title(self):
        return self._title
    
    def get_author(self):
        return self._author
    
    def get_price(self):
        return self._price

book1 = Book("Python Programming", "John Smith", 25.99)

print("Book Title:", book1.get_title())
print("Book Author:", book1.get_author())
print("Book Price:", book1.get_price())

book1.set_details("Java Basics", "Alice Johnson", 19.99)

print("\nUpdated Book Title:", book1.get_title())
print("Updated Book Author:", book1.get_author())
print("Updated Book Price:", book1.get_price())
