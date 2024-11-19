package AbstractFactoryPattern.PizzaFactory;

import AbstractFactoryPattern.PizzaFactory.PizzaStore.DominozPizzaStore;
import AbstractFactoryPattern.PizzaFactory.PizzaStore.LapinosPizzaStore;


public class PizzaFactoryDemo {
    public void run(){
        DominozPizzaStore dominoStore = new DominozPizzaStore();
        dominoStore.orderPizza("cheese");

        LapinosPizzaStore lapinosPizzaStore = new LapinosPizzaStore();
        lapinosPizzaStore.orderPizza("mushroom");
    }
}   