package Controller;

import Model.Room;

import java.util.ArrayList;

public class RoomManager implements IGeneral<Room> {
   static ArrayList<Room> rooms = new ArrayList<>();
    static {
        rooms.add(new Room("VIP",500,"4"));
        rooms.add(new Room("FAKE!",300,"4"));
        rooms.add(new Room("FAKE2",10,"4"));
    }

    @Override
    public void showAll() {
        for (Room room : rooms
             ) {
            System.out.println(room);
        }
    }

    @Override
    public int findById(String id) {
        for (Room room:rooms
             ) {
            if (room.getId().equals(id)){
                return  rooms.indexOf(room);
            }
        }
        return -1;
    }

    @Override
    public void addUser(Room i) {
        rooms.add(i);
    }

    @Override
    public void remove(int index) {
        rooms.remove(index);
    }

}
