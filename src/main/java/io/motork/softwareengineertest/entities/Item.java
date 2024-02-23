package io.motork.softwareengineertest.entities;

import java.util.UUID;

public class Item {
    UUID id;
    String productName;
    int quantity;
    double price;
    double subTotal;

    public UUID getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
