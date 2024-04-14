package org.tatcheff.bank;
    public class BankAcc {
        private double balance;

        public BankAcc(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

