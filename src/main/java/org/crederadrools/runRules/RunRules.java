package org.crederadrools.runRules;
import org.crederadrools.builder.AccountRepository;
import org.crederadrools.builder.TransactionsRepository;
import org.crederadrools.facts.Account;
import org.crederadrools.facts.Transaction;

import java.util.List;

public class RunRules {
    public static void main(final String[] args) {
        List<Account> accountsList = AccountRepository.getAccounts();
        System.out.println("This is the accountsList:");
        System.out.println(accountsList);
    }
}