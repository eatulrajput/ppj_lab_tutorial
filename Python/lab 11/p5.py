print("Name: Atul Rajput")
print("Roll No.: 2230158")
print()

class BankAccount:
    def __init__(self, account_number, balance):
        self.account_number = account_number
        self.balance = balance
    
    def deposit(self, amount):
        self.balance += amount
        print(f"Deposited {amount}. New balance: {self.balance}")
    
    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print(f"Withdrew {amount}. New balance: {self.balance}")
        else:
            print("Insufficient funds.")


class SavingsAccount(BankAccount):
    def __init__(self, account_number, balance, interest_rate):
        super().__init__(account_number, balance)
        self.interest_rate = interest_rate
    
    def add_interest(self):
        interest_amount = self.balance * (self.interest_rate / 100)
        self.balance += interest_amount
        print(f"Added interest. New balance: {self.balance}")

bank_account = BankAccount("123456", 1000)
bank_account.deposit(500)           
bank_account.withdraw(200)         

print()

savings_account = SavingsAccount("789012", 2000, 2.5)
savings_account.deposit(1000)      
savings_account.add_interest()   
