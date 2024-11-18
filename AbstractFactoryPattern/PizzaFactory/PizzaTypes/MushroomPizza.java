package AbstractFactoryPattern.PizzaFactory.PizzaTypes;

import AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient.IngredientBase;

public class MushroomPizza extends Pizza {

    IngredientBase ingredientBase;
    MushroomPizza(IngredientBase ingredientBase){
        this.ingredientBase = ingredientBase;
    }

    @Override
    public void prepare() {
        dough = ingredientBase.createDaugh();
        sauce = ingredientBase.createPizza();
        pepperoni = ingredientBase.createPizza();
    }

    
}
