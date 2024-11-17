package AllPattternRunnerClasses;

import FactoryPattern.PizzaStores.PizzaStore;
import FactoryPattern.PizzaStores.Dominos.DominoStore;
import FactoryPattern.PizzaStores.Lapinoz.LapinozStore;

public class PizzaStoreDemo {
    public void run(){
        PizzaStore dominos = new DominoStore();
        dominos.orderPizza("cheese");

        PizzaStore lapinoz = new LapinozStore();
        lapinoz.orderPizza("mashroom");
    }
}
