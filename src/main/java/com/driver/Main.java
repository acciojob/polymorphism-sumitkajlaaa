package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main function called p
        Product p = new Product();

        // Call the method with two int parameters
        int result1 = p.product(2, 3);

        // Call the overloaded method with three int parameters
        int result2 = p.product(2, 3, 4);

        // Call the overloaded method with two double parameters
        double result3 = p.product(2.5, 3.5);
    }
}