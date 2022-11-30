package exceptions;

public class FileConnectionException extends RuntimeException{
    public FileConnectionException(String message) {
        System.out.println(message);
    }
}
