package org.crederadrools.runRules;
import org.crederadrools.builder.AccountRepository;
import org.crederadrools.builder.TransactionsRepository;
import org.crederadrools.facts.Account;
import org.crederadrools.facts.Transaction;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import java.util.List;

public class RunRules {
    public static void main(final String[] args) {
        KieContainer kieClasspathContainer = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kieClasspathContainer.newKieSession("StatelessFraudCheckdemo1");
        List<Account> accounts = AccountRepository.getAccounts();
        System.out.println(accounts);
        accounts.forEach(ksession::insert);

        ksession.fireAllRules();
    }
}