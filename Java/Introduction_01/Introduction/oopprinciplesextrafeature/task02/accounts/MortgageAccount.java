package homework.oop_extrafeature_08.Таsk02_Bank.accounts;

import homework.oop_extrafeature_08.Таsk02_Bank.clients.Client;

public class MortgageAccount extends Account {
    public MortgageAccount(Client client, double balance, double montlyInterestRate) {
        super(client, balance, montlyInterestRate);
    }
}
