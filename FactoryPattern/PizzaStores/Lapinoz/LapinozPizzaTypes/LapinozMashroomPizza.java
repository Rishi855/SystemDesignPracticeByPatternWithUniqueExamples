package FactoryPattern.PizzaStores.Lapinoz.LapinozPizzaTypes;

import FactoryPattern.PizzaStores.Pizza;

public class LapinozMashroomPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Your lapinoz mashroom pizza prearing...");
    }

    @Override
    public void bake() {
        System.out.println("Your lapinoz mashroom pizza baking...");
    }

    @Override
    public void cut() {
        System.out.println("Your lapinoz mashroom pizza cutting...");
    }

    @Override
    public void pack() {
        System.out.println("Your lapinoz mashroom pizza packing...");
    }
    
}
