package test;

class BankAccount {
 protected double balance;

 
 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }

 
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Insufficient funds or invalid amount.");
     }
 }


 public double getBalance() {
     return balance;
 }
}

//Subclass
class SavingsAccount extends BankAccount {

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 
 public void withdraw(double amount) {
     if (amount > 0) {
         if ((balance - amount) >= 100) {
             balance -= amount;
             System.out.println("Withdrew from savings: $" + amount);
         } else {
             System.out.println("Withdrawal denied. Balance cannot fall below $100.");
         }
     } else {
         System.out.println("Invalid withdrawal amount.");
     }
 }
}


public class Main {
 public static void main(String[] args) {
     SavingsAccount mySavings = new SavingsAccount(500.0);

     System.out.println("Initial Balance: $" + mySavings.getBalance());
     mySavings.deposit(200);      
     mySavings.withdraw(550);   
     mySavings.withdraw(400);     
     System.out.println("Final Balance: $" + mySavings.getBalance());
 }
}
