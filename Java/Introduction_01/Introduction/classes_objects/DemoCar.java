package homework.classes_Objects_05;

public class DemoCar {
    public static void main(String[] args) {

        //make cars

        Car mercedes=new Car("Mercedes","Benz S200",2009,160);
        mercedes.insuranceCategory();

        Car opel=new Car("Opel","Astra",1996,85);
        opel.insuranceCategory();

        Car bugatti=new Car("Bugatti","Veryron",2015,612);
        bugatti.insuranceCategory();

        Car lada=new Car("Lada","5",1998,75);
        lada.insuranceCategory();
    }
}
