package org.crederadrools.facts;

import java.util.List;

public class AccountBuilder {
    private List<Transaction> transactions;
    private List<Transaction> pendingTransactions;
    private String accountName;
    private int accountNumber;
    private float balance;
    private List<Account> knownRecipients;
    private String country = "UK";

    public AccountBuilder setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    public AccountBuilder setPendingTransactions(List<Transaction> pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
        return this;
    }

    public AccountBuilder setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public AccountBuilder setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder setBalance(float balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder setKnownRecipients(List<Account> knownRecipients) {
        this.knownRecipients = knownRecipients;
        return this;
    }
    public AccountBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public Account createAccount() {
        return new Account(transactions, pendingTransactions, accountName, accountNumber, balance, knownRecipients, country);
    }

}