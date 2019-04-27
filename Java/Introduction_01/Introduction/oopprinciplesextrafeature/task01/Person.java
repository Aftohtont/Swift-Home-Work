package homework.oop_extrafeature_08.Task01_School;

public abstract class Person {


    private final String name;

    public Person(String name) {
        this.name=validateName(name);
    }

    private String validateName(String name) {
        if (name != null && !name.isEmpty()) {
            return name;
        }
        return name = "default name";
    }


    protected String getName() {
        return name;
    }
}
