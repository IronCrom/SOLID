package ru.netology;

public class Purchase {
    private final String name;
    private int amount;

    public Purchase(String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return name + " - " + amount + " шт";
    }
}
