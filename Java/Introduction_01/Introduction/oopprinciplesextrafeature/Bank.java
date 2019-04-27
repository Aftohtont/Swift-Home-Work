package homework.oop_extrafeature_08.Таsk02_Bank;

import homework.oop_extrafeature_08.Таsk02_Bank.accounts.Account;
import homework.oop_extrafeature_08.Таsk02_Bank.accounts.DepositAccount;
import homework.oop_extrafeature_08.Таsk02_Bank.accounts.LoanAccount;
import homework.oop_extrafeature_08.Таsk02_Bank.accounts.MortgageAccount;
import homework.oop_extrafeature_08.Таsk02_Bank.clients.Client;
import homework.oop_extrafeature_08.Таsk02_Bank.clients.CompanyClient;
import homework.oop_extrafeature_08.Таsk02_Bank.clients.IndividualCLient;

import java.util.ArrayList;

public class Bank {

    private final String name;
    private ArrayList<Account> accounts;
    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    //open account in bank
    String open(String name, int typeClient, int typeAccount, double money, double bankInterest) {
        //check is not client of bank

        if (searchClientName(name) < 0) {//has new client

            // open account
            // check type of client
            Client cl = null;
            Account ac = null;

            switch (typeClient) {//create client
                case 1:
                    cl = new IndividualCLient(name);
                    break;
                case 2:
                    cl = new CompanyClient(name);
                    break;
                default:
                    System.out.println("Invalid client type");
                    break;
            }

            switch (typeAccount) {//create account int bank

                case 1:
                    ac = new DepositAccount(cl, money, bankInterest);// make deposit
                    break;
                case 2:
                    ac = new LoanAccount(cl, money, bankInterest);// make loan
                    break;
                case 3:
                    ac = new MortgageAccount(cl, money, bankInterest);
                    break;
            }
            cl.setBankAccount(ac);//add to client account
            this.clients.add(cl);//add to bank data base clients
            this.accounts.add(ac);// add to bank data base accounts

            return ac.getIban();//return number of iban when open account
        }
        return "-1";// not open account
    }

    // put money in account
    void put(String nameOrIban, double money) {
        int index = -1;
        int openAccountByName = searchClientName(nameOrIban);
        int openAccountByIban = searchClientIban(nameOrIban);


        if (openAccountByName != -1) {
            index = openAccountByName;
        } else if (openAccountByIban != -1) {
            index = openAccountByIban;
        }
        // we found account and can excecute operation
        if (openAccountByIban >= 0 | openAccountByName >= 0) {
            Account ac = this.accounts.get(index);
            if (money > 0) {
                ac.putMoney(money);
                System.out.println("Insert money and balance is " + this.accounts.get(index).getBalance());
            } else {
                System.out.println("money can't be negative");
            }
        }

    }

    // withdraw from account and it's only deposit

    public void get(String nameOrIban, double money) {
        int index = -1;
        int openAccountByName = searchClientName(nameOrIban);
        int openAccountByIban = searchClientIban(nameOrIban);


        if (openAccountByName != -1) {
            index = openAccountByName;
        } else if (openAccountByIban != -1) {
            index = openAccountByIban;
        }
        // we found account and can excecute operation
        if (openAccountByIban >= 0 | openAccountByName >= 0) {
            for (int i = 0; i < this.accounts.size(); i++) {
                Account ac = this.accounts.get(index);
                if (ac.getCanWithdraw()) {//if balance negative can withdraw
                    if (ac.getBalance() >= money) {
                        ((DepositAccount) ac).witdhrawMoney(money);
                        System.out.println("Witdraw money is " + money + " and balance is " + ac.getBalance());

                    } else {//not enought money balance
                        System.out.println("can't withdraw");
                    }
                    return;
                }
            }

        }
        System.out.println("can't withdraw");
    }


    //generate bankratio

    double info(String nameOrIban,int month){
        int index = -1;
        int openAccountByName = searchClientName(nameOrIban);
        int openAccountByIban = searchClientIban(nameOrIban);


        if (openAccountByName != -1) {
            index = openAccountByName;
        } else if (openAccountByIban != -1) {
            index = openAccountByIban;
        }
        if (index>-1){//has client make calculation for bank ratio
            return  this.accounts.get(index).calculateRate(month);

        }
            return -1;
    }

    //search i narhive bank for client
    private int searchClientName(String name) {
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getName().equals(name)) {
                return i;// he is client of bank can't open new account
            }
        }
        return -1;
    }

    //search i narhive bank for client
    private int searchClientIban(String iban) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getIban().equals(iban)) {
                return i;// return iban to open acoount to insert money
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Bank fib = new Bank("FIB");
        System.out.println(fib.open("Pepi", 1, 1, 1982, 0.88));
        System.out.println(fib.open("Pepi", 1, 1, 1200, 0.88));
        System.out.println(fib.open("Pepi Stogrcecki", 2, 1, 1600, 0.23));

        fib.put("00000001", 1000);
        fib.put("00000001", 318);
        //fib.get("00000002", 2201);
        for (int i = 0; i <fib.getAccounts().size() ; i++) {
            System.out.println(fib.getAccounts().get(i).getBalance());
        }
        System.out.println(fib.info("00000001",41));
    }
}
