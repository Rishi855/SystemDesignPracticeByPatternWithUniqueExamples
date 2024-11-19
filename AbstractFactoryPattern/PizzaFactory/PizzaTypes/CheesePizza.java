package AbstractFactoryPattern.PizzaFactory.PizzaTypes;

import AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient.IngredientBase;

public class CheesePizza extends Pizza{

    IngredientBase ingredientBase;
    public CheesePizza(IngredientBase ingredientBase){
        this.ingredientBase = ingredientBase;
    }

    @Override
    public void prepare() {
        dough = ingredientBase.createDough();
        sauce = ingredientBase.createSauce();
        pepperoni = ingredientBase.createPepperoni();
    }
    
}
