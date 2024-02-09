package org.crederadrools.builder;

import org.crederadrools.facts.Account;
import org.crederadrools.facts.Transaction;
import org.crederadrools.facts.AccountBuilder;


import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public static List<Account> getAccounts() {
        List<Account> accountList = new ArrayList<>();

        accountList.add(
                new AccountBuilder().setAccountName("User1").setAccountNumber(1).createAccount()
        );

    return accountList;
    }
}
