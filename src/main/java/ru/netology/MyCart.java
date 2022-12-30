package ru.netology;

public class MyCart implements Cart {

    protected Purchase[] purchases;

    public MyCart(MyShop myShop) {
        this.purchases = new Purchase[myShop.getSizeListOfProducts()];
    }

    public long sum(MyShop myShop) {
        long sum = 0;
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            sum += (long) purchase.getAmount() * myShop.getPrice(purchase.getName());
        }
        return sum;
    }

    @Override
    public void addToCart(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].getName().equals(title)) {

                purchases[i].setAmount(purchases[i].getAmount() + count);
                return;
            }
        }
    }

    @Override
    public void printCart(MyShop myShop) {
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            System.out.println("\t" + purchase.getName() + " " + purchase.getAmount() + " шт. в сумме " + (purchase.getAmount() * myShop.getPrice(purchase.getName())) + " руб.");
        }
    }
}
