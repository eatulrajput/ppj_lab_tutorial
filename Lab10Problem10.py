# Implement a class representing a Bank with methods to add accounts, remove accounts, and
# display total balance across all accounts.

print("Name: Atul Rajput")
print("Roll No. 2230158")
print()

class BankAccount:
def __init__(self, account_number, initial_balance=0):

self.account_number = account_number
self.balance = initial_balance

def deposit(self, amount):
if amount > 0:
self.balance += amount
print(f"Deposited {amount} successfully to account

{self.account_number}.")
else:
print("Invalid deposit amount.")

def withdraw(self, amount):
if 0 < amount <= self.balance:
self.balance -= amount
print(f"Withdrew {amount} successfully from account

{self.account_number}.")
else:

print("Insufficient funds or invalid withdrawal

amount.")

def get_balance(self):
return self.balance

class Bank:
def __init__(self):
self.accounts = {}

def add_account(self, account_number, initial_balance=0):
if account_number not in self.accounts:

self.accounts[account_number] =

BankAccount(account_number, initial_balance)

print(f"Account {account_number} added successfully.")
else:
print(f"Account {account_number} already exists.")

def remove_account(self, account_number):
if account_number in self.accounts:
del self.accounts[account_number]
print(f"Account {account_number} removed successfully.")
else:
print(f"Account {account_number} does not exist.")

def display_total_balance(self):
total_balance = sum(account.get_balance() for account in

self.accounts.values())
print(f"Total balance across all accounts: {total_balance}")

# Example usage:
bank = Bank()

# Add accounts
bank.add_account("123456", 1000)
bank.add_account("789012", 2000)

# Display total balance
bank.display_total_balance()

# Remove an account
bank.remove_account("123456")

# Display total balance after removal
bank.display_total_balance()