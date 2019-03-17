package Hotel_demo_Lesson_03.Client.Hotel;

import Hotel_demo_Lesson_03.Client.client.Client;

public class Hotel {
    private  String hotelName;
    private Room[][] rooms;

    public Hotel(String hotelName, Room[][] rooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
    }
    public boolean book(int floorNumber, int roomNumber, Client client)
    {
        if (
                roomNumber > 0
            && floorNumber > 0
            && rooms.length >= floorNumber
            && rooms[floorNumber-1].length >= roomNumber
                ) {
            Room roomToBook = rooms[floorNumber][roomNumber];
            return  roomToBook.book(client);
        }
        return false;
    }
}
