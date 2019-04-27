package homework.oop_extrafeature_08.Таsk02_Bank.clients;

import homework.oop_extrafeature_08.Таsk02_Bank.accounts.Account;

import java.util.ArrayList;

public class Client {

    private ArrayList<Account> bankAccount;

    private final String name;

    public Client(String name) {
        this.name = name;
        this.bankAccount=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setBankAccount(Account ac){
        if (ac!=null){
            this.bankAccount.add(ac);
        }
    }

    public ArrayList<Account> getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return name;
    }
}
