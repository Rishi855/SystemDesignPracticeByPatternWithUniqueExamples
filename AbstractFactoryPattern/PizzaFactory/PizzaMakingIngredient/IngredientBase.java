package AbstractFactoryPattern.PizzaFactory.PizzaMakingIngredient;

import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.CheeseBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.PepperoniBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.SauceBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.DoughBase;;

public interface IngredientBase {
    public DoughBase createDough();
    public SauceBase createSauce();
    public CheeseBase createCheese();
    public PepperoniBase createPepperoni();
}