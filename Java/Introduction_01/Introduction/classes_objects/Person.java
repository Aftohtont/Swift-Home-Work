package homework.classes_Objects_05;

import java.util.Random;

public class Person {

    // here not learn encapsulation

    // construction elmenths in class is:
    // 1) fields
    // 2) constructor
    // 3) methods
    // 4) geeters and setters

                                         //1) declaration fields(instance variable)- that means what we know object has
    String name;//  object will be  create has name and age
    int age;

                                        //2) constructors types
    // a) constructor without params
    public Person() {
        // initialize variable name & age whit write values
        this.name = "No name";
        this.age = -1;
    }

    //b) constructor take one params name & generate age
    public Person(String name) {
        this.name = name;
        this.age = new Random().nextInt(50) + 10;// from 10 to 49 genrate age
    }

    // c) take Two params
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }                       // end of constructors


                                        //3) Methods- means what object can do

    public String introduction() {
        if ((name == null && age <= 0) || name.isEmpty()||name.equals("No name")) {
            return "Hello, I am John Doe";
        } else if (age > 0) {
            return "Hello, I am " + name + "." + "I am " + age + " years old";
        } else {//age are not set properly(age<0)
            return "Hello, I am " + name + ".";
        }
    } // end of methods


                                        //4) getters adn setters

    //getters- return type must be type of field we won't to return
    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setters-set we must pass argument of type like type of field we won't to set
    //setters - give opportunity to make validations(if-else statments)
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid input name");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 && age <= 130) {
            System.out.println("age must be positive and no more than by 130");
            return;
        }
        this.age = age;
    }


    public static void main(String[] args) {
        //create object from certain class is call instance- which is object represent concrete class

        // Initialize object from class
        // 1) Type of class 2) name 3) = 4) keyword(new) 5)typeOFClass()
        Person noName = new Person();// now make object whit constructor 1) - a) from class and initialize whit his values the fields

        System.out.println("=====first object of type person whit constructor a)=====");
        // add fileds whit "."=enter value can modify
        System.out.println(noName.name);
        System.out.println(noName.age);

        System.out.println("=====second object of type person whit constructor b)=====");
        // use second(1) - b) constructor and give name age will be generate lonely
        Person pepi = new Person("Pepi");

        System.out.println(pepi.name);
        System.out.println(pepi.age);
        System.out.println("=====third object of type person whit constructor c)=====");

        Person manol = new Person("Manol", 20);

        System.out.println(manol.name);
        System.out.println(manol.age);

        // access to the methods we make whit "."
        System.out.println(noName.introduction());
        System.out.println(pepi.introduction());
        System.out.println(manol.introduction());

    }


}
