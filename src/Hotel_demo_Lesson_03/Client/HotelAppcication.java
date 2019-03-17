package Hotel_demo_Lesson_03.Client;

import Hotel_demo_Lesson_03.Client.Hotel.Hotel;
import Hotel_demo_Lesson_03.Client.Hotel.Room;
import Hotel_demo_Lesson_03.Client.client.Client;

public class HotelAppcication {
    public static void main(String[] args) {
        Room [][] hiltonRooms = new Room[1][1];
         Hotel hiltonHotel = new Hotel("HILTON", hiltonRooms);
        Client client1 = new Client("38099999999","Test client1");
        Client client2 = new Client("38099999998","Test client2");
    }
}
