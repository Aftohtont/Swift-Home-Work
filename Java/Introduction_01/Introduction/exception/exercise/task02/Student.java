package homework.exception_09.exercise.task02;

public class Student {
    private static int count = 6;
    private final String name;
    private double[] grades;


    public Student(String name, double[] grades) throws IsEmptyException {
        if (name == null) {
            throw new NullPointerException();
        } else if (name.isEmpty()) {

            throw new IsEmptyException("Name can't be null!");
        }
        this.name = name;
        this.grades = grades;
        this.grades = grades;
    }


    public void calcAverage() throws AverageException {
        double average = 0;
        try {
            for (int i = 0; i < 6; i++) {

                average += this.grades[i];
            }

            average /= count;
        }catch (ArrayIndexOutOfBoundsException ex){
            throw new AverageException("Cannot calculate average grade!",ex);
        }

    }
}
