package com.rsg.operators;
public class OrderPlacement {
    public static void main(String[] args) {
        boolean isAdmin = false;
        boolean paymentSuccessful = true;
        boolean stockAvailable = false;

        if ((paymentSuccessful & stockAvailable) | isAdmin) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order cannot be placed.");
        }
    }
}
