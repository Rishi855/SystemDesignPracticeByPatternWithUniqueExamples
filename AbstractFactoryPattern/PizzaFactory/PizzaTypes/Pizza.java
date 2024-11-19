package AbstractFactoryPattern.PizzaFactory.PizzaTypes;

import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Cheese.CheeseBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Dough.DoughBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Pepperoni.PepperoniBase;
import AbstractFactoryPattern.PizzaFactory.PizzaTypes.Sauce.SauceBase;

public abstract class Pizza {
    public abstract void prepare();
    String name;
    DoughBase dough;
    CheeseBase cheese;
    PepperoniBase pepperoni;
    SauceBase sauce;
    public void bake(){
        System.out.println("Preparing...");
    }
    public void cut(){
        System.out.println("Cutting...");
    }
    public void pack(){
        System.out.println("packing...");
    }
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}
