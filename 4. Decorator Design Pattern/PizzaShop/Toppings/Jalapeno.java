package PizzaShop.Toppings;

import PizzaShop.DecoratorPizza;
import PizzaShop.PizzaBase;

public class Jalapeno extends DecoratorPizza {
    PizzaBase pizza;

    public Jalapeno(PizzaBase pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        System.out.println(" + Jalapeno which costs: Rs 20");
        return pizza.cost() + 20;
    }
}
