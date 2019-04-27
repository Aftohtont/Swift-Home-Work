package homework.classes_Objects_05;

public class Car {

    //fields
    String brand;
    String model;
    double horsePower;
    int yearMade;

    public Car(String brand, String model,  int yearMade,double horsePower) {
        this.brand = validDate(brand) ? brand : "No brand";// if true set brand else no brand
        this.model = validDate(model) ? model : "No model";// analogy is same from line 13
        this.horsePower = validateHorsePower(horsePower) ? horsePower : 0;
        this.yearMade = (yearMade > 1990) ? yearMade : 1990;// validate year
    }

    public boolean validDate(String str) {//validate input data from console
        if (str == null || str.isEmpty()) {
            System.out.println("invalid input");
            return false;
        }
        return true;
    }

    public boolean validateHorsePower(double power) {
        if (power <= 0) {
            System.out.println("horse power must postive");
            return false;
        }
        return true;
    }
    //getters
    public double getHorsePower() {
        return horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearMade() {
        return yearMade;
    }
    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    //check which category is
    public void insuranceCategory() {
        double taxPay = 0;
        int category = 0;
        int yearNow=2018;
        int carAge=yearNow-yearMade;
        if (carAge > 0 && carAge<= 8 || carAge== 0) { //category 1 - 1-8 years
            taxPay = calculateTax(this.horsePower, category);
        } else if (carAge > 8 && carAge <= 15) {//category 2 - 8-15 years
            category = 1;
            taxPay = calculateTax(this.horsePower,category);
        } else if (carAge > 15 && carAge<= 25) {//category 3 - 15-25 years
            category = 2;
            taxPay = calculateTax(this.horsePower,category);
        } else {                            //category 4 - over 25 years
            category = 3;
            taxPay = calculateTax(this.horsePower,category);
        }
        System.out.println(taxPay);
    }

    // calculate tax
    private double calculateTax(double horsePower, int category) {
        double sum = 0;
        double sumCatOne = 150;
        double sumCatTwo = 200;
        double sumCatThree = 300;
        double sumCatFour = 500;

        if (horsePower > 0 && horsePower < 80) {
            sum = 1.20;// it represent 20% add to sum
        } else {
            sum = 1.45;// it represent 45% add to sum
        }

        switch (category) {
            case 0:
                 sum *= sumCatOne;
            break;
            case 1:
                 sum *= sumCatTwo;
            break;
            case 2:
                 sum *= sumCatThree;
            break;
            default:
                 sum *= sumCatFour;
            break;

        }
        return sum;
    }


}
