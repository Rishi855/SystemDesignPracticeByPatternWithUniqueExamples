package AbstractFactoryPattern.PizzaFactory.PizzaStore;

import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pizza;

public abstract class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza(String pizzaType){
        pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);
}
