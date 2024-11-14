package FactoryPattern.PizzaStores.Dominos.DominoPizzaTypes;

import FactoryPattern.PizzaStores.Pizza;

public class DominosPepporoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Your dominos pepporoni pizza prearing...");
    }

    @Override
    public void bake() {
        System.out.println("Your dominos pepporoni pizza baking...");
    }

    @Override
    public void cut() {
        System.out.println("Your dominos pepporoni pizza cutting...");
    }

    @Override
    public void pack() {
        System.out.println("Your dominos pepporoni pizza packing...");
    }
    
}
