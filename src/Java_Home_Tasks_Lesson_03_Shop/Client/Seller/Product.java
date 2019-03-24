package Java_Home_Tasks_Lesson_03_Shop.Client.Seller;

import Java_Home_Tasks_Lesson_03_Shop.Client.Costumer.Costumer;

public class Product {
    private int price;
    private boolean available;

    public Product(int price) {
        this.price = price;
        this.available = true;
    }

    public int getPrice() {
        return price;
    }
}
