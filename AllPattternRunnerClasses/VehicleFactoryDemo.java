package AllPattternRunnerClasses;

import FactoryPattern.VehicleFactory.VehicleShowroom;

// this example explain you why you need abstract factory pattern
public class VehicleFactoryDemo {
    public void run(){
        VehicleShowroom regularCarVehcile = new VehicleShowroom("Car","Regular");
        regularCarVehcile.PlaceOrder();

        VehicleShowroom regularBikeVehcile = new VehicleShowroom("Bike","Regular");
        regularBikeVehcile.PlaceOrder();

        
        VehicleShowroom regularTruckVehcile = new VehicleShowroom("Truck","Modified");
        regularTruckVehcile.PlaceOrder();
    }
}
