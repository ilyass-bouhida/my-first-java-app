package com.example.models;

public abstract  class User {
    private long id;
    private String name;
    private String Email;

    public User(String name, String email) {
        this.name = name;
        this.Email = email;
    }

    public String getname() {
        return name;
    }
    public String getEmail() {
        return Email;
    }
    


    public abstract void displayUserInfo();



    // 
    
    //     System.out.println("User ID: " + id + ", Name: " + name + ", Email: " + Email);
    // 
}
