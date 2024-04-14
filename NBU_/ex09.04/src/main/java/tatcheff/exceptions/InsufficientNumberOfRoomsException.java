package tatcheff.exceptions;

public class InsufficientNumberOfRoomsException extends Exception{
    private final int numberOfRooms;

    public InsufficientNumberOfRoomsException(String message, int numberOfRooms) {
        super(message);
        this.numberOfRooms = numberOfRooms;
    }
}
