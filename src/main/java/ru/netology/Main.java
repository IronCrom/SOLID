package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyShop myShop = new MyShop().addToListOfProducts("Хлеб", 56)
                .addToListOfProducts("Масло", 153)
                .addToListOfProducts("Колбаса", 211)
                .addToListOfProducts("Пирожок", 45);
        myShop.printListOfProducts();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        MyCart myCart = new MyCart(myShop);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            myCart.addToCart(product, count);
        }
        long sum = myCart.sum(myShop);
        myCart.printCart(myShop);
        System.out.println("ИТОГО: " + sum);
    }
}