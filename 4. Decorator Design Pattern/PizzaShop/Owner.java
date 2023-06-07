package PizzaShop;

import PizzaShop.Pizzas.VeggieDelight;
import PizzaShop.Toppings.ExtraCheese;
import PizzaShop.Toppings.Jalapeno;

public class Owner {
    public static void main(String args[]){
        PizzaBase order = new VeggieDelight();

        //Add some extra toppings to it:
        PizzaBase orderWithJalapeno = new Jalapeno(order);

        //Add extra cheese:
        PizzaBase orderWithJalapenoAndExtraCheese = new ExtraCheese(orderWithJalapeno);

        System.out.println("Total Bill: " + orderWithJalapenoAndExtraCheese.cost());
        //Recursion
    }
}
