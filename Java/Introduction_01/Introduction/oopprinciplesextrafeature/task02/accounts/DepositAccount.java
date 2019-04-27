package homework.oop_extrafeature_08.Таsk02_Bank.accounts;

import homework.oop_extrafeature_08.Таsk02_Bank.clients.Client;
import homework.oop_extrafeature_08.Таsk02_Bank.clients.IndividualCLient;

public class DepositAccount extends Account {

    public DepositAccount(Client indClient, double amount, double montlyInterestRate) {
    super(indClient,amount,montlyInterestRate);
        setCanWithdraw(true);
    }



    public void witdhrawMoney(double money) {
        if (this.getBalance()>=money){
            this.setBalance(this.getBalance()-money);
        }

    }

}
