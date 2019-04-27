package homework.oop_principles_debugginf_06.task05;


public class SecondaryEducation {


    private final String enrollmentDate;
    private final String institutionName;

    private String grade;
    private boolean isGraduate;
    private String graduationDate;
    private int takeYear;

    public SecondaryEducation(String institutionName, String enrollmentDate, String graduationDate,String grade) {
        this(institutionName,enrollmentDate,graduationDate);
        setGrade(grade);
    }


    //make whitoute grade
    public SecondaryEducation(String institutionName, String enrollmentDate, String graduationDate) {

        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;

        this.institutionName = setName(institutionName);
        String[] tokenDate = enrollmentDate.split("[.]");
        this.takeYear = (Integer.parseInt(tokenDate[tokenDate.length - 1]) > 1980) ? Integer.parseInt(tokenDate[tokenDate.length - 1]) : -1;//use for calculation
            this.grade="";

    }

    //validate name
    private String setName(String name) {

        if (name != null && !name.isEmpty()) {

            return name;
        }
        System.out.println("Name institution can't be empty");
        return "default name";
    }


    //getter
    public int getTakeYear() {
        if (takeYear > 0) {
            return takeYear;
        }
        System.out.println("No year");
        return -1;
    }

    public String getInstitutionName() {
        if (institutionName != null) {
            return institutionName;
        }
        System.out.println("No institutaion name");
        return "-1";
    }

    public String getGrade() {
        return grade;
    }

    public String getEnrollmentDate() {
        if (enrollmentDate != null) {
            return enrollmentDate;
        }
        System.out.println("No enrollment date");
        return "-1";
    }

    public String getGraduationDate() {
        if (graduationDate != null) {
            return graduationDate;
        }
        System.out.println("No graduation date date");
        return "-1";
    }

    public void setGrade(String grade) {
        if (grade != null && !grade.isEmpty()&&Double.parseDouble(grade)>2) {
            this.isGraduate = true;
            this.grade = grade;
            return;
        }
        this.isGraduate = false;
        this.grade="";
    }

    boolean getIsGraduate() {
        return isGraduate;
    }
}
