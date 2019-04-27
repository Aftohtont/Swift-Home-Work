package homework.oop_extrafeature_08.Task01_School;

public class Student extends Person {

    private Class classOfStudent;
    private  int classNumber;

    public Student(String name,Class classStudent) {
        super(name);
        if (classStudent!=null) {//student enroll in class and give number
            this.classOfStudent = classStudent;
            if (classStudent.enrollStudentInClass(this)){
                System.out.println("enroll in class");
            }else {//it was added in class
                System.out.println("you are was record in this class");
            }
        }else {// no real class to add
            System.out.println("Student has no class");
            this.classOfStudent=new Class("No class");
        }

    }

    public Class getClassOfStudent() {
        return classOfStudent;
    }

    //add number in class on student
    public void setId(int studentClassNumber) {
        if (studentClassNumber>0) {
            this.classNumber = studentClassNumber;
        }
    }

    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public String toString() {
        return getName();
    }
}
