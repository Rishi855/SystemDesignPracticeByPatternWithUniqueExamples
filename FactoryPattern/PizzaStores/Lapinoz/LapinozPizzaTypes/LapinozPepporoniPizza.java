package FactoryPattern.PizzaStores.Lapinoz.LapinozPizzaTypes;

import FactoryPattern.PizzaStores.Pizza;

public class LapinozPepporoniPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Your lapinoz pepporoni pizza prearing...");
    }

    @Override
    public void bake() {
        System.out.println("Your lapinoz pepporoni pizza baking...");
    }

    @Override
    public void cut() {
        System.out.println("Your lapinoz pepporoni pizza cutting...");
    }

    @Override
    public void pack() {
        System.out.println("Your lapinoz pepporoni pizza packing...");
    }
    
}
