package FactoryPattern.VehicleFactory.Vehicles.Car;

import FactoryPattern.VehicleFactory.Vehicles.Vehicle;
import FactoryPattern.VehicleFactory.Vehicles.VehicleFactory;

public class CarFactory extends VehicleFactory{

    @Override
    public Vehicle CreateVehicle(String vehicleType) {
        if(vehicleType=="Regular"){
            System.out.println("Regular car called");
            return new CarRegular();
        }
        else{
            System.out.println("Regular car called");
            return new CarModified();
        }
    }
    
}
