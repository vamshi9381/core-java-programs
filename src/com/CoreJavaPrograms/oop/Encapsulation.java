package com.CoreJavaPrograms.oop;

class BankAccount {

private String accountHolder;
private double balance;


// Setter for accountHolder

public void setAccountHolder(String accountHolder) {

this.accountHolder = accountHolder;

}


// Getter for accountHolder

public String getAccountHolder() {

return accountHolder;

}


// Setter for balance

public void setBalance(double balance) {

if(balance >= 0) {

this.balance = balance;

}
else {

System.out.println("Balance cannot be negative");

}

}


// Getter for balance

public double getBalance() {

return balance;

}

}


public class Encapsulation {

public static void main(String[] args) {

BankAccount account = new BankAccount();


// Setting values using setters

account.setAccountHolder("Vamshi");

account.setBalance(50000);


// Getting values using getters

System.out.println("Account Holder: "
+ account.getAccountHolder());

System.out.println("Balance: "
+ account.getBalance());


// Trying to set negative balance

account.setBalance(-1000);

System.out.println("Balance after update: "
+ account.getBalance());

}

}