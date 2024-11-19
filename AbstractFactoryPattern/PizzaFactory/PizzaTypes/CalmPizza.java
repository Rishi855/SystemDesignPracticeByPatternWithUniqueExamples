package AbstractFactoryPattern.PizzaFactory.PizzaTypes;

import AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient.IngredientBase;

public class CalmPizza extends Pizza{

    IngredientBase ingredientBase;
    public CalmPizza(IngredientBase ingredientBase){
        this.ingredientBase = ingredientBase;
    }

    @Override
    public void prepare() {
        dough = ingredientBase.createDough();
        sauce = ingredientBase.createSauce();
        pepperoni = ingredientBase.createPepperoni();
    }
    
}
