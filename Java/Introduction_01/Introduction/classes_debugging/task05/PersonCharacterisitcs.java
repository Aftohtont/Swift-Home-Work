package homework.oop_principles_debugginf_06.task05;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class PersonCharacterisitcs {
    //fields
    private final String fName;
    private final String sName;
    private final char gender;
    private final int height;
    private int age;
    private SecondaryEducation secEdu;

    // cosntructor
    public PersonCharacterisitcs(String fName, String sName, char gender, int height, String dateBorn, String nameInstitution, String enrollEducation, String graduateDate, String grade) {

        this.fName = setName(fName);
        this.sName = setName(sName);
        this.gender = (gender == 'M' || gender == 'W') ? gender : 'N';//if not true N - is no gender
        this.height = height > 0 ? height : -1;
        this.age = LocalDate.now().getYear() - setAge(dateBorn);
        if (grade != null) {
            if (grade.isEmpty()){
                this.secEdu=new SecondaryEducation(nameInstitution, enrollEducation, graduateDate);
            }else {
                this.secEdu = new SecondaryEducation(nameInstitution, enrollEducation, graduateDate, grade);
            }
        }
        setAge(dateBorn);

    }


    //setters
    public int setAge(String age) {
        int yearLenght = 4;
        int year = Integer.parseInt(age.substring(age.length() - (yearLenght), age.length()));
        if (year > 0) {
            return year;
        }
        System.out.println("age can't be negative");
        return -1;
    }

    public String setName(String name) {

        if (name != null && !name.isEmpty()) {

            return name;
        }
        System.out.println("Name can't be negative or emptry!");
        return "default name";
    }


    public void printInfo() {
        if (secEdu.getInstitutionName() != "-1" && secEdu.getEnrollmentDate() != "-1" && secEdu.getGraduationDate() != "-1" && secEdu.getIsGraduate()) {//we has access to print
                System.out.printf("%s;%s is;%c;%s;%s;%s;%n", this.fName, this.sName, this.gender, this.secEdu.getEnrollmentDate(), this.secEdu.getGraduationDate(), this.secEdu.getGrade());
        } else {
            System.out.printf("%s;%s;%c;%s;%s;%n", this.fName, this.sName, this.gender, this.secEdu.getEnrollmentDate(), this.secEdu.getGraduationDate());

        }
    }

    @Override
    public String toString() {
        if(!this.secEdu.getGrade().isEmpty()) {
            return fName + " " + sName + " is years old." + "He was born in " + String.valueOf(LocalDate.now().getYear() - age) + ".He started " + this.secEdu.getInstitutionName()
                    + " on " + this.secEdu.getEnrollmentDate() + " and finished on " + this.secEdu.getIsGraduate() + " whit grade of " + this.secEdu.getGrade();
        }else{
            return fName + " " + sName + " is years old." + "He was born in " + String.valueOf(LocalDate.now().getYear() - age) + ".He started " + this.secEdu.getInstitutionName()
                    + " on " + this.secEdu.getEnrollmentDate() + " and is supposed to grdauate on " + this.secEdu.getIsGraduate() + fName+" "+sName+" is under age";

        }
    }
}

