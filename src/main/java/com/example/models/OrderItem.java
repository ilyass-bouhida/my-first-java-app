package com.example.models;

public class OrderItem {
    public Product product;
    public int quantity;
    public double price;

    public OrderItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
