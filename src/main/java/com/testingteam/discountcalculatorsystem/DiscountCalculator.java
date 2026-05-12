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
        
         int discount = 5;
         
         if (customerType.equals("NEW") && totalOrders >= 10) {
            throw new IllegalArgumentException(
                    "NEW customers cannot have 10 or more orders");
        }

        if (subscribed) {
            discount += 2;
        }

        if (customerType.equals("REGULAR")) {
            discount += 3;
        }

        else if (customerType.equals("PREMIUM")) {
            discount += 5;
        }

        if (totalOrders >= 10) {
            discount += 5;
        }

        return discount;
    }
}
