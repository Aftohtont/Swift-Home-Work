package homework.oop_principles_debugginf_06.task4;

public class Product {
    private final String name;
    private double price;

    public Product(String name,double price){
        this.name=(name!=null&&!name.isEmpty())?name:"default name";
        this.price=price>0?price:0;// if money<0 we set 0

    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
