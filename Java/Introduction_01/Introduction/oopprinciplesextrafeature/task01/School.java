package homework.oop_extrafeature_08.Task01_School;

import javax.jws.soap.SOAPBinding;

public class School {

    public static void main(String[] args) {

        Class cls=new Class("Class");

        Student student1=new Student("student1",cls);
        Student student2=new Student("student2",cls);
        Student student3=new Student("student3",cls);
        Student student4=new Student("student4",cls);
        Student student5=new Student("student5",cls);
        Student student6=new Student("student6",cls);

        Teacher teacher1=new Teacher("Teacher 1");
        Teacher teacher2=new Teacher("Teacher 2");
        Teacher teacher3=new Teacher("Teacher 3");
        Teacher teacher4=new Teacher("Teacher 4");
        Teacher teacher5=new Teacher("Teacher 5");
        Teacher teacher6=new Teacher("Teacher 6");
        Teacher teacher7=new Teacher("Teacher 7");

        Discipline math=new Discipline("Math",2);
        Discipline geography=new Discipline("Geography",2);
        Discipline biology=new Discipline("Biology",2);
        Discipline language=new Discipline("Language",2);
        Discipline philosophy=new Discipline("Philosophy",2);
        Discipline design=new Discipline("Design",2);
        teacher1.addDiscipline(math);
        teacher1.addDiscipline(geography);
        teacher1.addDiscipline(language);
        teacher1.addDiscipline(philosophy);
        teacher1.addDiscipline(biology);
        teacher1.addDiscipline(design);

        teacher2.addDiscipline(math);
        teacher3.addDiscipline(biology);
        teacher4.addDiscipline(geography);
        teacher4.addDiscipline(philosophy);
        teacher4.addDiscipline(geography);
        teacher5.addDiscipline(design);

        System.out.println(teacher1.getDisciplines());
        teacher1.addClass(cls);
        teacher2.addClass(cls);
        System.out.println(teacher2.getDisciplines());
        teacher3.addClass(cls);
        System.out.println(teacher3.getDisciplines());
        teacher4.addClass(cls);
        System.out.println(teacher4.getDisciplines());
        teacher5.addClass(cls);
        System.out.println(teacher5.getDisciplines());
        teacher6.addClass(cls);
        System.out.println(teacher6.getDisciplines());
        teacher7.addClass(cls);
        System.out.println(teacher7.getDisciplines());
        System.out.println(cls.getTeachers());
        System.out.println(cls.getStudents());


        for (int i = 0; i <teacher1.getDisciplines().size() ; i++) {
            System.out.print(teacher1.getDisciplines().get(i).getHourPerWeek()+" ");
        }
        System.out.println();
        System.out.println(design.getTeachers());
        teacher1.teach();

        for (int i = 0; i <teacher1.getDisciplines().size() ; i++) {
            System.out.print(teacher1.getDisciplines().get(i).getHourPerWeek()+" ");
        }
        System.out.println();
        teacher1.teach();
        teacher1.teach();
        for (Student st:cls.getStudents()) {
            System.out.print(st.getName()+"="+st.getClassNumber()+" "+st.getClassOfStudent().getNameOfClass()+" ");
        }
        System.out.println(cls.toString());
        System.out.println(cls.getStudents());
        System.out.println(cls.getTeachers());

    }
}
