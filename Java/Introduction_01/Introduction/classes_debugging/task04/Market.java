package homework.oop_principles_debugginf_06.task4;

import java.util.Scanner;

public class Market {
    private final  static int sizeClient = 200;
    private final static int sizeProduct = 500;
   private final  Person[] clients;
    private final Product[] products;
    private static int countClient;
    private static int countProduct;

    public Market() {
        this.clients = new Person[sizeClient];
        this.products = new Product[sizeProduct];
        this.countClient = 0;
        this.countProduct = 0;
    }

    public static void main(String[] args) {


        Market market = new Market();                 // instance of market

        Scanner sc = new Scanner(System.in);       // input from user


        while (true) {
            System.out.print("Enter command:");
            String command = sc.nextLine();
            if (command.equals("END")) {

            }

            //take client in shop
            String[] personsCharactersitics = command.split(";");
            if (personsCharactersitics[0].length()<= 1) {
                System.out.println("Must  enter name and price");
                break;
            }
            //add client in shop
            if (!addClient(personsCharactersitics, market)) {
                break;
            }

            System.out.print("Enter command:");
            command = sc.nextLine();
            //take product in shop
            String[] productsCharactersitics = command.split(";");

            if (productsCharactersitics[0].length() <= 1) {
                System.out.println("Product must have name and price");
                break;
            }
            // take product in shop
            if (!addProduct(productsCharactersitics, market)) {
                break;
            }
            System.out.println("Enter command to buy:");
            while (!(command = sc.nextLine()).toLowerCase().equals("end")) {       // take command to buy product


                int lastIdx = command.lastIndexOf(" ");//take last position to know were start name of product
                String nameBuyer = command.substring(0, lastIdx);
                String nameProduct = command.substring(lastIdx + 1);


                int cl = findBuyer(nameBuyer, market);//search client

                int pr = findProduct(nameProduct, market);// search product

                if (cl > -1 && pr > -1) {
                    Person client = market.clients[cl];
                    Product prod = market.products[pr];

                    if (client.buyProduct(prod)) {
                        System.out.printf(client.getName() + " bought " + prod.getName());
                    } else {
                        System.out.printf(client.getName() + " can't afford " + prod.getName());
                    }
                    System.out.println();

                }
                System.out.println("Enter command to buy:");

            }

            printBuyProduct(market);
            break;
        }


    }


    private static void printBuyProduct(Market market) {
        for (int i = 0; i < countClient; i++) {
                Person client=market.clients[i];
            System.out.print(client.getName()+"-");
            if (market.clients[i].getCountProducts() == 0) {
                System.out.println( "Nothing bought");
                continue;
            }
            for (int j = 0; j < market.clients[i].getCountProducts(); j++) {
                System.out.print( "," + client.getBaskett()[j].getName());
            }
            System.out.println();
        }

    }


    private static int findBuyer(String name, Market market) {
        for (int i = 0; i < countClient; i++) {
            if (market.clients[i].getName().equals(name))
                return i;
        }
        return -1;
    }


    private static int findProduct(String name, Market market) {
        for (int i = 0; i < countProduct; i++) {
            if (market.products[i].getName().equals(name))
                return i;
        }
        return -1;
    }

    private static boolean addClient(String[] personsCharactersitics, Market market) {

        for (int i = 0; i < personsCharactersitics.length; i++) {
            String[] nameAndMoney = personsCharactersitics[i].split("=");
            String name = nameAndMoney[0];
            double money = Double.parseDouble(nameAndMoney[1]);
            if (name == null || name.isEmpty()) {
                System.out.printf("Name can't be empty");
                return false;
            }
            if (money < 0) {
                System.out.printf("Balance can't be negative");
                return false;
            }
            //make object person
            market.clients[countClient++] = new Person(name, money);
        }
        return true;
    }

    private static boolean addProduct(String[] productsCharactersitics, Market market) {

        for (int i = 0; i < productsCharactersitics.length; i++) {
            String[] nameAndPrice = productsCharactersitics[i].split("=");
            String name = nameAndPrice[0];
            double money = Double.parseDouble(nameAndPrice[1]);
            if (name == null || name.isEmpty()) {
                System.out.printf("Name can't be empty");
                return false;
            }
            if (money < 0) {
                System.out.printf("Price can't be negative");
                return false;
            }
            // make object product
            market.products[countProduct++] = new Product(name, money);
        }
        return true;
    }

}
