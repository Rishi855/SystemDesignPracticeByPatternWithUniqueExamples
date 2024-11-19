package AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient;

import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.CheeseBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.ReggianoCheese;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.DoughBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.ThickCrushDough;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.PepperoniBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.SlicedPepperoni;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.MarinaraSauce;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.SauceBase;

public class LapinoseIngredient implements IngredientBase{

    @Override
    public DoughBase createDough() {
        return new ThickCrushDough();
    }

    @Override
    public SauceBase createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public CheeseBase createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public PepperoniBase createPepperoni() {
        return new SlicedPepperoni();
    }
}
