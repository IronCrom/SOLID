package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyShop myShop = new MyShop().addToListOfProducts(new Product("Хлеб", 56))
                .addToListOfProducts(new Product("Масло", 153))
                .addToListOfProducts(new Product("Колбаса", 211))
                .addToListOfProducts(new Product("Пирожок", 45));
        myShop.printListOfProducts();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase(myShop);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addToCart(product, count);
        }
        long sum = purchase.sum(myShop);
        purchase.printCart(myShop);
        System.out.println("ИТОГО: " + sum);
    }
}