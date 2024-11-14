package FactoryPattern.PizzaStores.Dominos;

import FactoryPattern.PizzaStores.Pizza;
import FactoryPattern.PizzaStores.PizzaStore;
import FactoryPattern.PizzaStores.Dominos.DominoPizzaTypes.DominosCheesePizza;
import FactoryPattern.PizzaStores.Dominos.DominoPizzaTypes.DominosMashroomPizza;
import FactoryPattern.PizzaStores.Dominos.DominoPizzaTypes.DominosPepporoniPizza;

public class DominoStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType){
        if(pizzaType=="cheese"){
            return new DominosCheesePizza();
        }
        else if(pizzaType=="mashroom"){
            return new DominosMashroomPizza();
        }
        else if(pizzaType=="pepporoni"){
            return new DominosPepporoniPizza();
        }
        return null;
    }
}
