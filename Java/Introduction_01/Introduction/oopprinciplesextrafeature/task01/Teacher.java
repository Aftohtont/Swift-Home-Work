package homework.oop_extrafeature_08.Task01_School;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<Class> teacherClasses;
    private ArrayList<Discipline> disciplines;

    public Teacher(String name) {
        super(name);
        this.teacherClasses = new ArrayList<>();//classes which lectures
        this.disciplines = new ArrayList<>();

    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    //add discipline
    void addDiscipline(Discipline discip) {
        if (disciplines.size() > 5) {
            System.out.println("No more brain to storage information");
            return;
        }
        // if new dicspipline add
        if (discip != null && !this.disciplines.contains(discip)) {
            this.disciplines.add(discip);
            discip.addTeacher(this);
            System.out.println("teacher has new discipline");
        }
        // he already teach in this discipline
        else{
            System.out.println("Not again!");
        }
    }

    //add to classes to teach
        void addClass(Class classTeach) {
            if (this.teacherClasses.size() > 5) {
                System.out.println("No physical abilities to teach");
                return;
            }
            if (!this.teacherClasses.contains(classTeach)) {
                if (classTeach.enrollTeacherInClass(this)) {//add in class to teach
                    System.out.println("teacher choose class");
                    this.teacherClasses.add(classTeach);
                } else {
                    System.out.println("No budget to teach twice");
                }
            }
        }


        void teach(){
            for (Discipline discip:this.disciplines) {
                if (discip.getHourPerWeek()>0){
                    System.out.println("Teach by "+discip.toString());
                    discip.setHourPerWeek(1);
                }else{
                    System.out.println("No more hours to teach");
                }

            }

        }

    @Override
    public String toString() {
        return getName();
    }
}

