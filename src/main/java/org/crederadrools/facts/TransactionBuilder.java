package org.crederadrools.facts;

import java.time.LocalDateTime;

public class TransactionBuilder {
    private int receivingAccountNumber;
    private int sendingAccountNumber;
    private String receipient;
    private String sender;
    private String transferMethod;
    private float amount;
    private LocalDateTime transactionTime;

    public TransactionBuilder setReceivingAccountNumber(int receivingAccountNumber) {
        this.receivingAccountNumber = receivingAccountNumber;
        return this;
    }

    public TransactionBuilder setSendingAccountNumber(int sendingAccountNumber) {
        this.sendingAccountNumber = sendingAccountNumber;
        return this;
    }

    public TransactionBuilder setReceipient(String receipient) {
        this.receipient = receipient;
        return this;
    }

    public TransactionBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public TransactionBuilder setTransferMethod(String transferMethod) {
        this.transferMethod = transferMethod;
        return this;
    }

    public TransactionBuilder setAmount(float amount) {
        this.amount = amount;
        return this;
    }

    public TransactionBuilder setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    public Transaction createTransaction() {
        return new Transaction(receivingAccountNumber, sendingAccountNumber, receipient, sender, transferMethod, amount, transactionTime);
    }
}