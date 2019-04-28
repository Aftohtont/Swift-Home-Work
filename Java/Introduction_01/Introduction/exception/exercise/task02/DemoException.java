package homework.exception_09.exercise.task02;

public class DemoException {
    public static void main(String[] args) throws AverageException {

        double [] grades={2,3,4,5};
        try {
            Student st=new Student("Pepi",grades);
            st.calcAverage();
        } catch (IsEmptyException e) {
            e.printStackTrace();
        }
    }
}
