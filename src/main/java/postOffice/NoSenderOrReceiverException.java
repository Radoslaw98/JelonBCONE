package postOffice;

public class NoSenderOrReceiverException extends RuntimeException {

    public NoSenderOrReceiverException(String message) {
        super(message);
    }
}
