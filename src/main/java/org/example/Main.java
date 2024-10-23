package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Orders order1 = new Orders(1,1206.7, List.of("Coffee", "Biscuits","Tea"));
        Orders order2 = new Orders(2, 300.8, List.of("Water", "Sandwich"));
        Orders order3 = new Orders(3, 499.0, List.of("Coffee", "Salad"));
        Orders order4 = new Orders(4, 8799.0, List.of("Donut", "Meat", "Coffee", "Pizza"));

        List<Orders> orders = List.of(order1, order2, order3, order4);

        Orders.haveCoffee(orders);
    }
}
