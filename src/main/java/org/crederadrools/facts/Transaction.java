package org.crederadrools.facts;

import java.time.LocalDateTime;

public class Transaction {
    private int receivingAccountNumber;
    private int sendingAccountNumber;

    private String receipient;

    private String sender;
    private String transferMethod;
    private float Amount;

    private LocalDateTime transactionTime;

    private Status status = Status.PENDING;

    public int getReceivingAccountNumber() {
        return receivingAccountNumber;
    }

    public void setReceivingAccountNumber(int receivingAccountNumber) {
        this.receivingAccountNumber = receivingAccountNumber;
    }

    public int getSendingAccountNumber() {
        return sendingAccountNumber;
    }

    public void setSendingAccountNumber(int sendingAccountNumber) {
        this.sendingAccountNumber = sendingAccountNumber;
    }

    public String getReceipient() {
        return receipient;
    }

    public void setReceipient(String receipient) {
        this.receipient = receipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTransferMethod() {
        return transferMethod;
    }

    public void setTransferMethod(String transferMethod) {
        this.transferMethod = transferMethod;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Transaction(int receivingAccountNumber, int sendingAccountNumber, String receipient, String sender,
                       String transferMethod, float amount, LocalDateTime transactionTime) {
        this.receivingAccountNumber = receivingAccountNumber;
        this.sendingAccountNumber = sendingAccountNumber;
        this.receipient = receipient;
        this.sender = sender;
        this.transferMethod = transferMethod;
        Amount = amount;
        this.transactionTime = transactionTime;
        this.status = Status.PENDING;
    }
}
