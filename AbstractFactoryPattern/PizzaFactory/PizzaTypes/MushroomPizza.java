package AbstractFactoryPattern.PizzaFactory.PizzaTypes;

import AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient.IngredientBase;

public class MushroomPizza extends Pizza {

    IngredientBase ingredientBase;
    public MushroomPizza(IngredientBase ingredientBase){
        this.ingredientBase = ingredientBase;
    }

    @Override
    public void prepare() {
        dough = ingredientBase.createDough();
        sauce = ingredientBase.createSauce();
        pepperoni = ingredientBase.createPepperoni();
    }

    
}
