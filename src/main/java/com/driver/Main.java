package com.driver;

public class Main {

    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: Create a method with the following definition
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with the following definition
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method with the following definition
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main function called p
        Product p = new Product();

        // Call the method with two int parameters
        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3: " + result1);

        // Call the overloaded method with three int parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4: " + result2);

        // Call the overloaded method with two double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5: " + result3);
    }
}

