package com.example.models;
import java.security.Timestamp;
import java.time.Instant;
import java.util.List;

import com.example.enums.OrderStatus;

public class Order {

    public Customer customer;
    public List<OrderItem> items;
    public OrderStatus status;
    public Instant createdAt;

    public Order(Customer customer, List<OrderItem> items, OrderStatus status, Timestamp createdAt){
        this.customer = customer;
        this.items = items;
        this.status = OrderStatus.PENDING;
        this.createdAt = Instant.now();

    }





}
