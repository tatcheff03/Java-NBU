package tatcheff.hotel;

import tatcheff.exceptions.InsufficientNumberOfRoomsException;
import tatcheff.exceptions.RoomIsRented;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int numberOfRooms;
    private List<Integer> rooms;

    public Hotel(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        rooms = new ArrayList<>();
    }

    public void rentRoom(int roomNum) throws InsufficientNumberOfRoomsException, RoomIsRented {
        if (rooms.size() >= numberOfRooms) {
            throw new InsufficientNumberOfRoomsException("No rooms available", numberOfRooms);
        }
        if (!rooms.contains(roomNum)) {
            rooms.add(roomNum);
        } else {
            throw new InsufficientNumberOfRoomsException("Room already rented", roomNum);
        }
    }
}
