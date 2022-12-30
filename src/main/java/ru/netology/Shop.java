package ru.netology;

public interface Shop {

    MyShop addToListOfProducts(String title, int price);

    int getSizeListOfProducts();

    void printListOfProducts();
}
