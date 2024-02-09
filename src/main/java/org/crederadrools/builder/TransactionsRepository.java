package org.crederadrools.builder;

import org.crederadrools.facts.Transaction;
import org.crederadrools.facts.TransactionBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionsRepository {
    public static List<Transaction> getTransactions() {
        List<Transaction> TransactionList = new ArrayList<>();

        TransactionList.add(
                new TransactionBuilder()
                        .setReceivingAccountNumber(2)
                        .setSendingAccountNumber(1)
                        .setReceipient("User2")
                        .setSender("User1")
                        .setAmount(43)
                        .setTransactionTime(LocalDateTime.of(2024, 2, 1, 15, 30))
                        .createTransaction()
        );

        TransactionList.add(
                new TransactionBuilder()
                        .setReceivingAccountNumber(2)
                        .setSendingAccountNumber(1)
                        .setReceipient("User2")
                        .setSender("User1")
                        .setAmount(10)
                        .setTransactionTime(LocalDateTime.of(2024, 2, 2, 15,
                                30, 30)).createTransaction()
        );

        TransactionList.add(
                new TransactionBuilder()
                        .setReceivingAccountNumber(2)
                        .setSendingAccountNumber(1)
                        .setReceipient("User2")
                        .setSender("User1")
                        .setAmount(11)
                        .setTransactionTime(LocalDateTime.of(2024, 2, 2, 15,
                                30, 31)).createTransaction()
        );

        TransactionList.add(
                new TransactionBuilder()
                        .setReceivingAccountNumber(2)
                        .setSendingAccountNumber(1)
                        .setReceipient("User2")
                        .setSender("User1")
                        .setAmount(11)
                        .setTransactionTime(LocalDateTime.of(2024, 2, 2, 15,
                                30, 32)).createTransaction()
        );

        TransactionList.add(
                new TransactionBuilder()
                        .setReceivingAccountNumber(2)
                        .setSendingAccountNumber(3)
                        .setReceipient("User2")
                        .setSender("User3")
                        .setAmount(1100000)
                        .setTransactionTime(LocalDateTime.of(2024, 1, 2, 15, 30))
                        .createTransaction()
        );

        TransactionList.add(
                new TransactionBuilder()
                        .setReceivingAccountNumber(2)
                        .setSendingAccountNumber(4)
                        .setReceipient("User2")
                        .setSender("User4")
                        .setAmount(1100000)
                        .setTransactionTime(LocalDateTime.of(2024, 2, 2, 15, 30))
                        .createTransaction()
        );

//        TransactionList.add(
//                new TransactionBuilder()
//                        .setReceivingAccountNumber(2)
//                        .setSendingAccountNumber(1)
//                        .setReceipient("User2")
//                        .setSender("User1")
//                        .setAmount(11)
//                        .setTransactionTime(LocalDateTime.of(2024, 2, 2, 15, 30))
//                        .createTransaction()
//        );
//
//        TransactionList.add(
//                new TransactionBuilder()
//                        .setReceivingAccountNumber(2)
//                        .setSendingAccountNumber(1)
//                        .setReceipient("User2")
//                        .setSender("User1")
//                        .setAmount(11)
//                        .setTransactionTime(LocalDateTime.of(2024, 2, 2, 15, 30))
//                        .createTransaction()
//        );

        return TransactionList;
    }
}

