package org.crederadrools.facts;

import java.util.List;


public class Account {
    private List<Transaction> transactions;

    private List<Transaction> pendingTransactions;

    private String accountName;
    private int accountNumber;

    private float balance;

    private List<Account> knownRecipients;

    private String Country;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public List<Account> getKnownRecipients() {
        return knownRecipients;
    }

    public void setKnownRecipients(List<Account> knownRecipients) {
        this.knownRecipients = knownRecipients;
    }


    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getPendingTransactions() {
        return pendingTransactions;
    }

    public void setPendingTransactions(List<Transaction> pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Account(List<Transaction> transactions, List<Transaction> pendingTransactions, String accountName, int accountNumber, float balance, List<Account> knownRecipients, String country) {
        this.transactions = transactions;
        this.pendingTransactions = pendingTransactions;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.knownRecipients = knownRecipients;
        this.Country = country;
    }

    @Override
    public String toString() {
        return String.format("This Account [#%s, %s]", accountName, accountNumber);
    }
}
