package io.motork.softwareengineertest.controllers;

import io.motork.softwareengineertest.entities.Order;
import io.motork.softwareengineertest.repositories.OrderRepository;
import io.motork.softwareengineertest.services.OrderService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/orders")
public class OrderController {

    OrderService orderService;
    OrderRepository orderRepository;

    public OrderController() {
        this.orderService = new OrderService();
        this.orderRepository = new OrderRepository();
    }

    @PostMapping
    public void save(Order order) {
        orderService.save(order);
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable String id) {
        return orderService.findById(id);
    }

    @PostMapping("/{id}")
    public void update(@PathVariable String id, Order order) {
        if (id != order.getId().toString()) {
            throw new IllegalArgumentException("Id in path and body do not match");
        }
        orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id, Order order) {
        if (id != order.getId().toString()) {
            throw new IllegalArgumentException("Id in path and body do not match");
        }
        orderService.delete(order);
    }

    @PostMapping("/{data}")
    public void findAll(@PathParam("data") String data) {
        orderRepository.findAll().stream().filter(order -> order.getCustomerName().contains(data)).toList();
    }
}
