package AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient;

import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pizza;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.CheeseBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.MozzarellaCheese;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.DoughBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.ThickCrushDough;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.PepperoniBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.SlicedPepperoni;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.PlumTomatoSauce;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.SauceBase;

public class DominozIngredient implements IngredientBase{

    @Override
    public DoughBase createDough() {
        return new ThickCrushDough();
    }

    @Override
    public SauceBase createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public CheeseBase createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public PepperoniBase createPepperoni() {
        return new SlicedPepperoni();
    }

    
}
