package homework.oop_principles_debugginf_06.task3;

import java.util.Scanner;

public class BankManagment {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();// initialize object of type bank

        while (true) {
            System.out.println("enter command from possible operations:OPEN, CLOSE, DEPOSIT, TRANSFER, WITHDRAW and END to stop operation");
            String operation = sc.next().toLowerCase();

            if (operation.equals("end")){

                System.out.printf("%.1f%n",bank.getAssets());
                for (Account acc:bank.getAccounts()){
                            if (acc!=null)
                    System.out.printf("%s,%s,%.2f%n",acc.getName(),acc.getGovId(),acc.getBalance());
                }
            }

            switch (operation) {
                case "open":
                    // input data
                    System.out.print("Enter user name");
                    String userName = sc.next();
                    System.out.print("Enter password");
                    String pass = sc.next();
                    System.out.print("Enter  name");
                    String name = sc.next();
                    System.out.print("Enter government id");
                    String govId = sc.next();

                    System.out.printf("OPEN %s%n", bank.openAccount(userName, pass, name, govId) ? "success" : "fail");
                    break;

                case "close":
                    System.out.print("Enter user name");
                    userName = sc.next();
                    System.out.print("Enter password");
                    pass = sc.next();
                    System.out.printf("CLOSE %s%n", bank.closeAccount(userName, pass) ? "success" : "fail");
                    break;

                case "deposit":

                    System.out.print("Enter user name");
                    userName = sc.next();

                    System.out.print("Enter amount");
                    double amount = sc.nextDouble();
                    System.out.printf("DEPOSIT %s%n", bank.deposit(userName, amount) ? "success" : "fail");
                    break;

                case "withdraw":
                    System.out.print("Enter user name");
                    userName = sc.next();
                    System.out.print("Enter pass");
                    pass = sc.next();

                    System.out.print("Enter amount");
                    amount = sc.nextDouble();
                    System.out.printf("WITHDRAW %s%n", bank.withdraw(userName, pass, amount) ? "success" : "fail");
                    break;
                case "transfer":

                    System.out.print("Enter user name");
                    userName = sc.next();
                    System.out.print("Enter pass");
                    pass = sc.next();
                    System.out.print("Enter amount");
                    amount = sc.nextDouble();
                    System.out.print("Enter recipient user name");
                    String recipient = sc.next();

                    System.out.printf("Transfer %s%n", bank.transfer(userName, pass, amount,recipient ) ? "success" : "fail");
                    break;
                default:
                    System.out.printf("not supported operation");
                    break;
            }
        }
    }
}
