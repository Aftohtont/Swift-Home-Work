package homework.oop_principles_debugginf_06.task4;

public class Person {

    private final String name;
    private double balance;
    private Product[] baskett;
    private int initialCapacity = 10;
    private int countProducts = 0;

    public Person(String name, double balance) {
        this.name = (name != null && !name.isEmpty()) ? name : "default name";
        this.balance = balance > 0 ? balance : 0;// if money<0 we set 0
        this.baskett = new Product[initialCapacity];

    }

    //buy product
    public boolean buyProduct(Product prod) {

        if (balance == 0) return false;
        if (countProducts == baskett.length) {//if no place in basket take bigger
            increaseBasket();
        }
        if (countProducts < baskett.length) {//we has place in basket to add product
            if (prod.getPrice() <= balance) {//check we have money to buy
                baskett[countProducts++] = prod;
                //remove from omey price of product
                this.balance -= prod.getPrice();
                return true;
            }
        }
        return false;//no money to buy
    }

    // increase capacity to basket
    private void increaseBasket() {
        //make new bigger basket
        Product[] newBasket = new Product[initialCapacity * 2];
        //take product from old basket and add in new bigger basket
        for (int i = 0; i < baskett.length; i++) {
            newBasket[i] = baskett[i];
        }
        this.baskett = newBasket;//make reference to point to new basket
    }

    public String getName() {
        return name;
    }

    public Product[] getBaskett() {
        return baskett;
    }

    public int getCountProducts() {
        return countProducts;
    }
}
