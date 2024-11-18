package AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient;

import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.CheeseBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.DoughBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.PepperoniBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.SauceBase;

public class DominozIngredient implements IngredientBase{

    @Override
    public DoughBase createDough() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDough'");
    }

    @Override
    public SauceBase createSauce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createSauce'");
    }

    @Override
    public CheeseBase createCheese() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCheese'");
    }

    @Override
    public PepperoniBase createPepperoni() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPepperoni'");
    }
    
}
