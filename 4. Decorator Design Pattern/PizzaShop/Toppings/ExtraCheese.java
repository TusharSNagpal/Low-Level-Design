package PizzaShop.Toppings;

import PizzaShop.DecoratorPizza;
import PizzaShop.PizzaBase;

public class ExtraCheese extends DecoratorPizza {
    PizzaBase Pizza;

    //Constructor Injection..
    public ExtraCheese(PizzaBase Pizza){
        this.Pizza = Pizza;
    }

    @Override
    public int cost() {
        System.out.println(" + Extra Cheese which costs: Rs 10");
        return Pizza.cost() + 10;
    }
}
