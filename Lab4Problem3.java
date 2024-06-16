// Create a Java class called Account with the member data account number, name, balance. Using
// constructors and member methods, perform the following:
// 1. to accept and display the details of an account
// 2. to credit the account with some amount and display the message “A/C credited with Rs. XYZ
// and Balance: Rs. ABC” (where, XYZ is the amount credited and ABC is the new balance in the
// account).
// 3. to debit the account with some amount and display the message “A/C debited with Rs. XYZ
// and Balance: Rs. ABC” (where, XYZ is the amount debited and ABC is the new balance in the
// account).

import java.util.*;

class Account {
int accountNumber;
String name;
double balance;

// Constructor to accept details of an account
Account(int accNumber, String accName, double initialBalance) {
accountNumber = accNumber;
name = accName;
balance = initialBalance;
}

// Method to display the details of an account
void displayAccountDetails() {
System.out.println("Account details: Account Number - " + accountNumber + ", Name - " +
name + ", Balance - Rs. " + balance);
}

// Method to credit the account with some amount
void credit(double amount) {
balance += amount;

System.out.println("A/C credited with Rs. " + amount + " and Balance: Rs. " + balance);
}

// Method to debit the account with some amount
void debit(double amount) {
if (amount <= balance) {
balance -= amount;
System.out.println("A/C debited with Rs. " + amount + " and Balance: Rs. " + balance);
} else {
System.out.println("Insufficient funds. Debit operation failed.");
}
}
}

class DisplayAccount {
public static void main(String[] args) {
System.out.println("");
System.out.println("Name: Atul Rajput");
System.out.println("Roll No.: 2230158");
System.out.println("");
Scanner sc = new Scanner(System.in);

System.out.println("Enter the account details:");

System.out.print("Account Number: ");
int accNumber = sc.nextInt();
sc.nextLine(); // Consume the newline character
System.out.print("Account Name: ");
String accName = sc.nextLine();
System.out.print("Initial Balance: Rs. ");
double initialBalance = sc.nextDouble();

// Creating an object of the Account class
Account account = new Account(accNumber, accName, initialBalance);

// Displaying the details of the account
account.displayAccountDetails();

// Crediting the account and displaying the result
System.out.print("Enter the amount to credit: Rs. ");
double creditAmount = sc.nextDouble();
account.credit(creditAmount);

// Debiting the account and displaying the result
System.out.print("Enter the amount to debit: Rs. ");
double debitAmount = sc.nextDouble();
account.debit(debitAmount);

}
}