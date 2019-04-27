package homework.oop_principles_debugginf_06.task02;


import java.util.Scanner;

public class CredentialManager {
    private Credential[] dataBase;
    private int dataBaseSize;
    private int fillRecords;

    CredentialManager() {
        this.dataBase = new Credential[dataBaseSize];
        this.dataBaseSize = 200;
        this.dataBase = new Credential[dataBaseSize];
        this.fillRecords = 0;
    }


    public static void main(String[] args) {

        //create data base whit records of size 200
        CredentialManager cm = new CredentialManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation from list:ENROLL, CHPASS, AUTH nad END for exit program");
        String command = sc.next().toLowerCase();
        while (!command.equals("end")) {

            if (command.equals("end")) {
                System.out.println("Exit program");
                break;
            }
            System.out.print("Enter user name");
            String name = sc.next();

            System.out.print("Enter user password");
            String pass = sc.next();

            switch (command) {

                case "enroll":
                    System.out.printf("Enroll %s", cm.enroll(name, pass) ? "success" : "fail");
                    break;
                case "chpass":
                    System.out.print("Enter new pass");

                    System.out.printf("CHPASS %s", cm.chPass(name, pass, sc.next()) ? "success" : "fail");
                    break;
                case "auth":

                    System.out.printf("AUTH %s", cm.auth(name, pass) ? "success" : "fail");
                    break;
                default:
                    System.out.println("Unrecognizable command!");

            }
            System.out.println();
            System.out.println("Enter operation from list:ENROLL, CHPASS, AUTH nad END for exit program");
            command = sc.next();

        }

    }

    // add new client
    private boolean enroll(String name, String password) {
        if (!isExistingInDataBase(name)) {// is not exist and we can add new client in our data base
            this.dataBase[fillRecords++] = new Credential(name, password);
            return true;
        }
        // has records in data base
        return false;
    }


    //check in data base is exist it help to add new client
    private boolean isExistingInDataBase(String name) {
        for (int i = 0; i < fillRecords; i++) {
            if (dataBase[i].getCredentialName().equals(name)) {
                return true;//we has that name in our base( we has match)
            }
        }   // no matches
        return false;
    }

    // modify credential case
    private boolean chPass(String name, String currentPass, String newPass) {

        int placeRecord = placeInBaseRecords(name);

        if (placeRecord >= 0) {//if exist we can change passowrd

            Credential cr = this.dataBase[placeRecord];// take refernce of object from data base

            return cr.changePassword(currentPass, newPass);//we change pass

        }
        // no found user
        return false;//we can't change
    }

    // check in data base and return credential(object) it help to modify existing client
    private int placeInBaseRecords(String name) {
        for (int i = 0; i < fillRecords; i++) {
            if (dataBase[i].getCredentialName().equals(name)) {
                return i;//we has that name in our base( we has match)
            }

        }
        return -1;
    }

    private boolean auth(String name, String pass) {
        int placeIndataBase = placeInBaseRecords(name);

        if (placeIndataBase >= 0) {
            Credential cr = this.dataBase[placeIndataBase];
            return cr.isMatchWhitPassword(pass);//we has match passwords

        }

        return false;// passwprd are different
    }
// END OF CLASS Credential manger
    ////////// begin demo

}



