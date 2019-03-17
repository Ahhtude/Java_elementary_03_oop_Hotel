package Hotel_demo_Lesson_03.Client.Hotel;

import Hotel_demo_Lesson_03.Client.client.Client;

public class Room {
    private double square;
    private int places;
    private Double price; // null
    private boolean occupied; // false
    private Client occupiedBy; //null

    public Room(double square, int places) {
        this.square = square;
        this.places = places;
    }
    public boolean book (Client client){
        if (occupied){
            return false;
        }
        occupiedBy = client;
        occupied = true;
        return true;
    }
    public boolean release(){
        if (occupied){
            occupied=false;
            occupiedBy= null;
            return true;
        }
        return false;
    }
}
