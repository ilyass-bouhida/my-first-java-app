package com.example.models;
import com.example.enums.Category;


public class Product {
    private long id ;
    private String Name;
    private double  price ;
    private int stock;
    private Category Categorie;


    public Product(String name, double price, int stock, Category categorie) {
        if(price < 0 || stock < 0) {
            throw new IllegalArgumentException("Price and stock must be non-negative.");
        }

        if (categorie == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }




        this.Name = name;
        this.price = price;
        this.stock = stock;
        this.Categorie = categorie;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Category getCategorie() {
        return Categorie;
    }






}
