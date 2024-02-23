package io.motork.softwareengineertest.services;

import io.motork.softwareengineertest.entities.Order;
import io.motork.softwareengineertest.repositories.ItemRepository;
import io.motork.softwareengineertest.repositories.OrderRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderService {

    OrderRepository orderRepository;
    ItemRepository itemRepository;

    public OrderService() {
        this.orderRepository = new OrderRepository();
        this.itemRepository = new ItemRepository();
    }

    public void save(Order order) {
        order.getItems().forEach(item -> itemRepository.save(item));
        orderRepository.save(order);
    }

    public Order findById(String id) {
        return orderRepository.findById(id);
    }

    public void update(Order order) {
        orderRepository.update(order);
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }

    public void removeItem(Order order, String itemId) {
        order.getItems().forEach(item -> {
            if (item.getId().equals(itemId)) {
                order.getItems().remove(item);
            }
        });
        orderRepository.update(order);
    }

    public Set<Order> findAll() {
        return new HashSet<>(orderRepository.findAll());
    }
}
