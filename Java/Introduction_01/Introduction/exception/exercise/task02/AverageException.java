package homework.exception_09.exercise.task02;

public class AverageException extends  Exception{

    public AverageException(String message) {
        super(message);
    }

    public AverageException(String message, Throwable cause) {
        super(message, cause);
    }
}
