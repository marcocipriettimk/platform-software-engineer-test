package io.motork.softwareengineertest.entities;

import java.util.List;
import java.util.UUID;

public class Order {
    final static List<String> validStatuses = List.of("pending", "processing", "completed", "cancelled");
    UUID id;
    String customerName;
    String customerAddress;
    String customerPhone;
    List<Item> items;
    String status;

    public UUID getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }
}
