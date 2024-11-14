package FactoryPattern.PizzaStores.Lapinoz;

import FactoryPattern.PizzaStores.Pizza;
import FactoryPattern.PizzaStores.PizzaStore;
import FactoryPattern.PizzaStores.Lapinoz.LapinozPizzaTypes.LapinozCheesePizza;
import FactoryPattern.PizzaStores.Lapinoz.LapinozPizzaTypes.LapinozMashroomPizza;
import FactoryPattern.PizzaStores.Lapinoz.LapinozPizzaTypes.LapinozPepporoniPizza;

public class LapinozStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String pizzaType){
        if(pizzaType=="cheese"){
            return new LapinozCheesePizza();
        }
        else if(pizzaType=="mashroom"){
            return new LapinozMashroomPizza();
        }
        else if(pizzaType=="pepporoni"){
            return new LapinozPepporoniPizza();
        }
        return null;
    }
}
