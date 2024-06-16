# Define a class for a Bank Account with methods to deposit, withdraw, and check balance. Ensure
# proper encapsulation of data.

print("Name: Atul Rajput")
print("Roll No. 2230158")
print()
class BankAccount:
def __init__(self, account_number, initial_balance=0):

self._account_number = account_number
self._balance = initial_balance
def deposit(self, amount):
if amount > 0:
self._balance += amount
print(f"Deposited {amount} successfully.")
else:
print("Invalid deposit amount.")

def withdraw(self, amount):
if 0 < amount <= self._balance:
self._balance -= amount
print(f"Withdrew {amount} successfully.")
else:

print("Insufficient funds or invalid withdrawal

amount.")
def check_balance(self):
print(f"Account Balance: {self._balance}")

account1 = BankAccount("123456", 1000)
account1.check_balance()
account1.deposit(500)

account1.check_balance()
account1.withdraw(300)
account1.check_balance()