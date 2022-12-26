package ru.netology;

public class Product {
    private final String name;
    private int price;

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public String toString() {
        return name + " - " + price + " руб/шт";
    }
}
