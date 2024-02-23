package io.motork.softwareengineertest.repositories;

import io.motork.softwareengineertest.entities.Order;

import java.util.List;

public class OrderRepository extends BaseRepository<Order>{

    public void save(Order order) {
        // Save the order to the database
    }

    public Order findById(String id) {
        // Find the order by id from the database
        return null;
    }

    public void update(Order order) {
        // Update the order in the database
    }

    public void delete(Order order) {
        // Delete the order from the database
    }

    public List<Order> findAll() {
        // Find all orders from the database
        return null;
    }
}
