package homework.oop_principles_debugginf_06.task3;

public class Bank {

    private final static int ACCOUNT_SIZE = 5;
    private Account[] accounts;
    private double assets;
    private int countAccounts = 0;

    public Bank() {
        this.accounts = new Account[ACCOUNT_SIZE];
        //add assets to bank from accounts
        for (int i = 0; i < countAccounts; i++) {
            assets += accounts[i].getBalance();
        }
    }

    //open account
    public boolean openAccount(String userName, String pass, String name, String govId) {
        if (countAccounts >= accounts.length) {//over limit
            return false;
        }

        if (!isExist(govId)) {//make new client
            Credential cred = new Credential(userName, pass);
            this.accounts[countAccounts++] = new Account(name, govId, cred);
            return true;
        }
        return false;//already exist client
    }

    private boolean isExist(String id) {
        for (int i = 0; i < countAccounts; i++) { // has client
            if (accounts[i].getGovId().equals(id)) {
                return true;
            }
        }
        // no client of bank
        return false;
    }

    //close account
    public boolean closeAccount(String userName, String password) {
        for (int i = 0; i < countAccounts; i++) {
            if (accounts[i].getUserName().equals(userName) && accounts[i].getUserPass().equals(password))
                //remove money from assets bank
                this.assets -= accounts[i].getBalance();
            //remove account from bank
            this.accounts[i] = null;//remove from accounts
            orderAccounts(i);
            return true; //close account
        }
        return false;// no match user or pass can't close
    }

    private void orderAccounts(int position) {
        //take empty postion and put the last know account on his place
        this.accounts[position] = accounts[--countAccounts];
    }

    //withdraw
    public boolean withdraw(String userName, String pass, double amount) {
        for (int i = 0; i < countAccounts; i++) {
            if (accounts[i].getUserName().equals(userName) && accounts[i].getUserPass().equals(pass)) {//make withdraws if username and password are matching
                if (accounts[i].getBalance() >= amount) {//check is balance positive or equal to zero
                    //remove money from account balance on client
                    accounts[i].withdraw(amount);
                    //remove money from bank assets
                    assets -= amount;
                    return true;
                }
            }
        }
        return false;// can't make withdraw not current user name or pass or money balance
    }


    public boolean deposit(String userName, double amount) {
        if (amount < 0) {
            return false;
        }
        int placeInDataBase = searchAccount(userName);
        if (placeInDataBase < 0) {
            return false;
        }
        accounts[placeInDataBase].deposit(amount);//increase account money
        assets += amount;//increase assets in bank
        return true;
    }

    private int searchAccount(String userName) {
        for (int i = 0; i < countAccounts; i++) {
            if (accounts[i].getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean transfer(String userName, String pass, double amount, String recipient) {//to make transfer recepient must be client of bankk to

        if (amount < 0) {
            return false;
        }
        int sender = searchAccount(userName);
        int receiver = searchAccount(recipient);

        if (sender > -1 && receiver > -1) {//make transfer
            accounts[sender].withdraw(amount);//take money from sender  and give to receiver
            accounts[receiver].deposit(amount);//take money from sender and increase on sender
            //don't remove from assets of bank becaouse they stay there
            return true;
        }
        return false;// here we don't have in base client to transfer moneys
    }

    //getters
    public double getAssets() {
        return assets;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}
