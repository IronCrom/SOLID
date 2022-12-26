package ru.netology;

public interface Shop {

    MyShop addToListOfProducts(Product product);

    int getSizeListOfProducts();

    void printListOfProducts();
}
