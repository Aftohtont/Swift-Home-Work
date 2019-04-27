package homework.oop_extrafeature_08.Task01_School;

import java.util.ArrayList;

public class Class {

    private static char uniqieIdentClassName = 'a';

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private int studentClassNumber;
    private final String nameOfClass;

    public Class(String nameOfClass) {
        this.nameOfClass = validateName(nameOfClass);
        this.students = new ArrayList<>();//allocate place in heap to add objectes
        this.teachers = new ArrayList<>();// allocate place in heap to add objects
        this.studentClassNumber = 0;
    }

    //validate name and give unique name
    private String validateName(String name) {
        if (uniqieIdentClassName > 'z') {
            System.out.println("Classes in school are full!");
            System.exit(1);//stop program capacity of classes in school is full
        }
        if (name != null && !name.isEmpty()) {
            return name + " /" + String.valueOf(uniqieIdentClassName) + "/";
        }
        return name = "default name";
    }


    //assign student in class
    boolean enrollStudentInClass(Student student) {

        if (this.students.size() == 20) {// class is full
            System.out.println("No more place for students in  this class. Create new class");
            return false;
        }
        //check  student is already enroll in this class
        if (this.students.contains(student)) {
            return false;
        }
        this.studentClassNumber = ++studentClassNumber;//assign whit number in class
        student.setId(this.studentClassNumber);
        this.students.add(student);
        return true;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    //assign teacher in class
    boolean enrollTeacherInClass(Teacher teacher) {

        if (this.teachers.size() == 5) {
            System.out.println("No more place for teachers in this class");
            return false;
        }
        if (this.teachers.contains(teacher)) {
            return false;
        }

        this.teachers.add(teacher);//add new teacher
        return true;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return nameOfClass;
    }
}