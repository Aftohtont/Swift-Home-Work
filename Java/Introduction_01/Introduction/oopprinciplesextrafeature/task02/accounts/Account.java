xtrafeature_08.Таsk02_Bank.accounts;

import homework.oop_extrafeature_08.Таsk02_Bank.clients.Client;

public class Account {
    private static int numIban = 1;
    private final String iban;
    private Client client;
    private double balance;
    private double montlyInterestRate;
    private boolean canWithdraw=false;

    public Account(Client client, double balance, double montlyInterestRate) {
        this.client = client;
        this.balance = balance;
        this.montlyInterestRate = montlyInterestRate/100;
        this.iban = String.format("%08d", numIban++);
    }

    public void setCanWithdraw(boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public  boolean getCanWithdraw(){
        return  this.canWithdraw;
    }


    public void setBalance(double balance) {
        if (balance>=0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }package homework.oop_extrafeature_08.Таsk02_Bank.accounts;

import homework.oop_extrafeature_08.Таsk02_Bank.clients.Client;

public class Account {
    private static int numIban = 1;
    private final String iban;
    private Client client;
    private double balance;
    private double montlyInterestRate;
    private boolean canWithdraw=false;

    public Account(Client client, double balance, double montlyInterestRate) {
        this.client = client;
        this.balance = balance;
        this.montlyInterestRate = montlyInterestRate/100;
        this.iban = String.format("%08d", numIban++);
    }

    public void setCanWithdraw(boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public  boolean getCanWithdraw(){
        return  this.canWithdraw;
    }


    public void setBalance(double balance) {
        if (balance>=0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public Client getClient() {
        return client;
    }

   public double calculateRate(int monthms) {
        return monthms * montlyInterestRate * getBalance();
    }

    //insert money
    public void putMoney(double amount){
        if (amount>0){
            this.balance+=amount;
        }
    }


}




    public String getIban() {
        return iban;
    }

    public Client getClient() {
        return client;
    }

   public double calculateRate(int monthms) {
        return monthms * montlyInterestRate * getBalance();
    }

    //insert money
    public void putMoney(double amount){
        if (amount>0){
            this.balance+=amount;
        }
    }


}


