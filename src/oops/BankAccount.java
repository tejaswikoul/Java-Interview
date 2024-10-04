package oops;

import exception.InsufficientFundsException;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "---Bank Account--- " + "\n" +
                "Account Number: " + this.accountNumber + "\n" +
                "Balance: " + this.balance;
    }

    public double deposit(double amount) {
        if (amount > 0){
            balance+=amount;
            System.out.println("Deposited Amount : " + amount);
        } else {
            System.out.println("Check Amount.");
        }
        return balance;
    }

    public double withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.out.println("Withdraw Amount: " + amount);
        return balance;
    }

    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount bank = new BankAccount();
        bank.setAccountNumber(1003210052L);
        bank.setBalance(1000);

        bank.deposit(1200);
        bank.withdraw(5000);

        System.out.println(bank);
    }
}
