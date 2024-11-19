package AbstractFactoryPattern.PizzaFactory.PizzaStore;

import AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient.DominozIngredient;
import AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient.IngredientBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.CalmPizza;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.CheesePizza;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.MushroomPizza;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pizza;

public class DominozPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        IngredientBase  ingredientBase = new DominozIngredient();
        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza(ingredientBase);
        }   
        else if(pizzaType.equals("clam")){
            pizza = new CalmPizza(ingredientBase);
        }
        else if(pizzaType.equals("mushroom")){
            pizza = new MushroomPizza(ingredientBase);
        }
        pizza.toString();
        return pizza;
    }
    
}
