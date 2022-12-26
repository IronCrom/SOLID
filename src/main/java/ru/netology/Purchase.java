package ru.netology;

public class Purchase implements Cart {
    protected String title;
    protected int count;
    protected Purchase[] purchases;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase(MyShop myShop) {
        this.purchases = new Purchase[myShop.getSizeListOfProducts()];
    }

    public long sum(MyShop myShop) {
        long sum = 0;
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            sum += (long) purchase.count * myShop.getPrice(purchase.title);
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
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    @Override
    public void printCart(MyShop myShop) {
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * myShop.getPrice(purchase.title)) + " руб.");
        }
    }
}
