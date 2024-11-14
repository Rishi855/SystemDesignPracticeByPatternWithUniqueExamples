package FactoryPattern.PizzaStores;

public abstract class PizzaStore {
    Pizza pizza;
    public void orderPizza(String pizzaType){
        pizza = createPizza(pizzaType);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.pack();
    }

    protected abstract Pizza createPizza(String pizzaType);  
    
}
