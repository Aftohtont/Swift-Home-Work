package homework.oop_principles_debugginf_06.task3;


import java.util.Random;

public class Account {

    private final String name;
    private final String govId;
    private double balance;
    private Credential credential;


    // constructor
    public Account(String name, String govID,Credential user) {
        this.name = validateName(name) ? name : "default name";
        this.govId = validateGovID(govID) ? govID : "123456789" + new Random().nextInt(1000);
        this.credential = user;
        this.balance = 0;
    }

        // methods
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        }
    }

    public boolean hasAccess(String password) {
        return credential.isMatchWhitPassword(password);
    }

    //validate name input
    private boolean validateName(String name) {
        return name != null && !name.isEmpty();

    }

    //validate gov id input
    private boolean validateGovID(String id) {
        boolean isDigitOnly = true;
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                isDigitOnly = false;
                break;
            }
        }
        return isDigitOnly;

    }

    //getters
    //get blance of account
    public double getBalance() {

        return balance;
    }

    //take name of account
    public String getName() {
        return name;
    }

    // take user name of credential
    public String getUserName() {
        return credential.getCredentialName();
    }

    //take user pass of credential
    public String getUserPass() {
        return credential.getCredentialPassword();
    }

    public String getGovId() {
        return govId;
    }

}
