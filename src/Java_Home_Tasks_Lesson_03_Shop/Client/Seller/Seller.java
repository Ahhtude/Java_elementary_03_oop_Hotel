package Java_Home_Tasks_Lesson_03_Shop.Client.Seller;

import Java_Home_Tasks_Lesson_03_Shop.Client.Costumer.Costumer;

import java.util.ArrayList;

public class Seller {
        private ArrayList<Product> products = new ArrayList<Product>();
        private String shopName;
        private int cashReceived;

    public Seller(ArrayList<Product> products, String shopName) {
        this.products = products;
        this.shopName = shopName;
    }
    public boolean selling (int numberOfProduct, Costumer costumer){
        if (products.get(numberOfProduct).sell(costumer))
        {
            cashReceived += products.get(numberOfProduct).getPrice();
            products.remove(numberOfProduct);
        }
        return false;
    }

    public int getCashReceived() {
        return cashReceived;
    }
}
