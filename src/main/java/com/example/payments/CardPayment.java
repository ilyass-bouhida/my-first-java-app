package com.example.payments;
import com.example.interfaces.Payment;
public class CardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        // Logic to process card payment
        System.out.println("Processing card payment of amount: " + amount);
    }
    
}
