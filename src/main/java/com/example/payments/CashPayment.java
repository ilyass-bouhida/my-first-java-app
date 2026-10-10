package com.example.payments;
import com.example.interfaces.Payment;
public class CashPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        // Logic to process cash payment
        System.out.println("Processing cash payment of amount: " + amount);
    }
    
}
