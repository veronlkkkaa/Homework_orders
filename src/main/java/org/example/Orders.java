package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString
//

public class Orders {
    int id;
    double price;
    List<String> products = new ArrayList<String>();

    public boolean consistOfCoffee(){
        return products.contains("Coffee");
    }

    public static void haveCoffee(List<Orders> orders){
        for(Orders order : orders){
            if(order.consistOfCoffee() && order.price > 500){
                System.out.println(order);
            }
        }
    }
}

