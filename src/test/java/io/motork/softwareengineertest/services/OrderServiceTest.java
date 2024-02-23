package io.motork.softwareengineertest.services;

import io.motork.softwareengineertest.entities.Order;
import io.motork.softwareengineertest.repositories.ItemRepository;
import io.motork.softwareengineertest.repositories.OrderRepository;
import io.motork.softwareengineertest.services.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    private OrderRepository orderRepository;

    private ItemRepository itemRepository;

    private OrderService orderService;

    @BeforeEach
    void setUp() {
        orderService = new OrderService();
    }

    @Test
    void saveOrderSuccessfully() {
        Order order = new Order();
        orderService.save(order);
        assert(orderService.findById(order.getId().toString()) != null);
    }

    @Test
    void findOrderByIdSuccessfully() {
        String id = "1";
        orderService.findById(id);
    }

    @Test
    void updateOrderSuccessfully() {
        Order order = new Order();
        orderService.update(order);
    }

    @Test
    void deleteOrderSuccessfully() {
        Order order = new Order();
        orderService.delete(order);
    }

    @Test
    void removeItemFromOrderSuccessfully() {
        Order order = new Order();
        String itemId = "1";
        orderService.removeItem(order, itemId);
    }

    @Test
    void findAllOrdersSuccessfully() {
        orderService.findAll();
    }
}