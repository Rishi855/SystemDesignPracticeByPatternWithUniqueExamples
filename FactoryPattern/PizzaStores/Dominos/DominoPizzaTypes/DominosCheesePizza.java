package FactoryPattern.PizzaStores.Dominos.DominoPizzaTypes;

import FactoryPattern.PizzaStores.Pizza;

public class DominosCheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Your dominos cheese pizza prearing...");
    }

    @Override
    public void bake() {
        System.out.println("Your dominos cheese pizza baking...");
    }

    @Override
    public void cut() {
        System.out.println("Your dominos cheese pizza cutting...");
    }

    @Override
    public void pack() {
        System.out.println("Your dominos cheese pizza packing...");
    }
    
}
