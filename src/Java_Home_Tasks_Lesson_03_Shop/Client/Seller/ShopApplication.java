package Java_Home_Tasks_Lesson_03_Shop.Client.Seller;

import Java_Home_Tasks_Lesson_03_Shop.Client.Costumer.Costumer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

public class ShopApplication {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        ArrayList<Product> products = new ArrayList<Product>();
        Seller vintageMarket= new Seller(products,"Vintage");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите объем товара для закупки:");
        int buyProductsForShop = Integer.parseInt(reader.readLine());
        for (int i=0;i<buyProductsForShop;i++) {
            products.add(new Product(random.nextInt()));
        }
        Costumer costumer = new Costumer("one@gmail.com","Alex");
        System.out.println("Выберете номер товара для отправки покупателю:");
        int productNumber = Integer.parseInt(reader.readLine());
        vintageMarket.selling(productNumber,costumer);
        products.remove(productNumber);
        System.out.println("Товар под номером "+productNumber+" был продан покупателю -"+costumer.getClientName());
        System.out.println("Магазин заработал - "+vintageMarket.getCashReceived());







    }




}
