package com.company;

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private int balance;

    BankAccount(String accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        if(amount > this.balance){
            System.out.println("You don't have enough balance.");
        }else{
            this.balance -= amount;
        }
    }

    public void showBalance(){
        System.out.println("Your account balance is "+this.balance);
    }
}
public class BankAccountQues {
    static void main() {
        BankAccount acc = new BankAccount("12380097467", "Isha Kumari", 5000);
        acc.deposit(3000);
        acc.showBalance();
        acc.withdraw(1000);
        acc.showBalance();
    }
}
