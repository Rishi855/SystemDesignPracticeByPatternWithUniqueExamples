package FactoryPattern.VehicleFactory.Vehicles.Bike;

import FactoryPattern.VehicleFactory.Vehicles.Vehicle;
import FactoryPattern.VehicleFactory.Vehicles.VehicleFactory;

public class BikeFactory extends VehicleFactory{

    @Override
    public Vehicle CreateVehicle(String vehicleType) {
        if(vehicleType=="Regular"){
            System.out.println("Regular Bike called");
            return new BikeRegular();
        }
        else{
            System.out.println("Modified Bike called");
            return new BikeModified();
        }
    }
    
}
