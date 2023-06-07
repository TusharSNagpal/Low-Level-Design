package PizzaShop.Pizzas;

import PizzaShop.PizzaBase;

public class VeggieDelight extends PizzaBase {
    @Override
    public int cost() {
        System.out.println("Your Veggie Delight is ready which costs: Rs 100");
        return 100;
    }
}