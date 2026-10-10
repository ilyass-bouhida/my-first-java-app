package com.example.models;

public class Customer extends User {
    private int phone;
    private String address;
    public Customer(String name, String email,int phone, String address ) {
        super(name, email);
        this.phone = phone;
        this.address = address;

    }

    @Override 
    public void displayUserInfo() {
        System.out.println("Customer Name: " + this.getname());
        System.out.println("Customer Email: " + this.getEmail());
        System.out.println("Customer Phone: " + this.phone);
        System.out.println("Customer Address: " + this.address);
    };
}
