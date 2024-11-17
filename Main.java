import AllPattternRunnerClasses.LoginDemo;
import AllPattternRunnerClasses.ParkingLotDemo;
import AllPattternRunnerClasses.PizzaStoreDemo;
import AllPattternRunnerClasses.VehicleFactoryDemo;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>> Chain of responsibility <<<<<<<<<<<<<<
        // new ParkingLotDemo().run();
        // new LoginDemo().run();

        //>>>>>>>>>>> Factory Design pattern <<<<<<<<<<<<<<
        // new PizzaStoreDemo().run();
        new VehicleFactoryDemo().run();
    }
}

// javac .\AllPattternRunnerClasses\*.java .\Main.java 
// java -cp . Main
