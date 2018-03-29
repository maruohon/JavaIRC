package net.blay09.javairc;

public class NotConnectedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotConnectedException(String message) {
        super(message);
    }

}
