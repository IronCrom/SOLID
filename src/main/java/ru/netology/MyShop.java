package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class MyShop implements Shop {
    protected Map<String, Integer> listOfProducts = new HashMap<>();

    public MyShop() {
    }

    public int getPrice(String title) {
        return listOfProducts.get(title);
    }

    @Override
    public MyShop addToListOfProducts(String title, int price) {
        listOfProducts.put(title, price);
        return this;
    }

    @Override
    public int getSizeListOfProducts() {
        return this.listOfProducts.size();
    }

    @Override
    public void printListOfProducts() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : listOfProducts.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
