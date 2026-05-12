/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testingteam.discountcalculatorsystem;

/**
 *
 * @author DELL
 */
public class DiscountCalculator {
    public static int calculateDiscount(
            String customerType,
            int totalOrders,
            boolean subscribed) {
        
         validateInput(customerType, totalOrders);

        int discount = 5;

        discount += getSubscriptionBonus(subscribed);
        discount += getCustomerTypeBonus(customerType);
        discount += getLoyaltyBonus(totalOrders);

        return Math.min(discount, 15);
    }
    private static void validateInput(String customerType, int totalOrders) {
        if (customerType.equals("NEW") && totalOrders >= 10) {
            throw new IllegalArgumentException(
                    "NEW customers cannot have 10 or more orders");
        }
    }

    private static int getSubscriptionBonus(boolean subscribed) {
        return subscribed ? 2 : 0;
    }

    private static int getCustomerTypeBonus(String customerType) {
        switch (customerType) {
            case "REGULAR":
                return 3;
            case "PREMIUM":
                return 5;
            default:
                return 0; // NEW
        }
    }

    private static int getLoyaltyBonus(int totalOrders) {
        return totalOrders >= 10 ? 5 : 0;
    }
}
