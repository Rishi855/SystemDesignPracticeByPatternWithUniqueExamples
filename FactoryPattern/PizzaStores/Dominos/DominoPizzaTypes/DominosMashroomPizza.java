package FactoryPattern.PizzaStores.Dominos.DominoPizzaTypes;

import FactoryPattern.PizzaStores.Pizza;

public class DominosMashroomPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Your dominos mashroom pizza prearing...");
    }

    @Override
    public void bake() {
        System.out.println("Your dominos mashroom pizza baking...");
    }

    @Override
    public void cut() {
        System.out.println("Your dominos mashroom pizza cutting...");
    }

    @Override
    public void pack() {
        System.out.println("Your dominos mashroom pizza packing...");
    }
    
}
