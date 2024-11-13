import SystemLogin.LoginDemo;
import VehicleParking.ParkingLotDemo;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>> Chain of responsibility <<<<<<<<<<<<<<
        // new ParkingLotDemo().run();
        new LoginDemo().run();
    }
}

// javac SystemLogin/LoginDemo.java VehicleParking/ParkingLotDemo.java Main.java
// java -cp . Main
