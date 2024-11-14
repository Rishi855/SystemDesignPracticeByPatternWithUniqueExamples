import ChainResponsibility.SystemLogin.LoginDemo;
import ChainResponsibility.VehicleParking.ParkingLotDemo;
import FactoryPattern.PizzaStores.PizzaStoreDemo;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>> Chain of responsibility <<<<<<<<<<<<<<
        // new ParkingLotDemo().run();
        // new LoginDemo().run();
        new PizzaStoreDemo().run();
    }
}

// javac ChainResponsibility/SystemLogin/LoginDemo.java ChainResponsibility/VehicleParking/ParkingLotDemo.java FactoryPattern/PizzaStores/PizzaStoreDemo.java Main.java
// java -cp . Main
