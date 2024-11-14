package FactoryPattern.PizzaStores.Lapinoz.LapinozPizzaTypes;

import FactoryPattern.PizzaStores.Pizza;

public class LapinozCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Your lapinoz cheese pizza prearing...");
    }

    @Override
    public void bake() {
        System.out.println("Your lapinoz cheese pizza baking...");
    }

    @Override
    public void cut() {
        System.out.println("Your lapinoz cheese pizza cutting...");
    }

    @Override
    public void pack() {
        System.out.println("Your lapinoz cheese pizza packing...");
    }
    
}
