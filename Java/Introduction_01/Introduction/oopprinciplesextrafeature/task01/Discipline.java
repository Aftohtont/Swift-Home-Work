package homework.oop_extrafeature_08.Task01_School;

import java.util.ArrayList;

public class Discipline {

    private String name;
    private double hourPerWeek;
    private ArrayList<Teacher> teachers;

    public Discipline(String name, double hourPerWeek) {
        this.name = name;
        this.hourPerWeek = hourPerWeek>0?hourPerWeek:0;
        this.teachers=new ArrayList<>();
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public double getHourPerWeek() {
        return hourPerWeek;
    }

    public void setHourPerWeek(double hourPerWeek) {
        if (hourPerWeek>0) {
            this.hourPerWeek -= hourPerWeek;
        }
        if (hourPerWeek<0){
            this.hourPerWeek=0;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

}
