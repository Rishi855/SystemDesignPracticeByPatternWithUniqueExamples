package FactoryPattern.VehicleFactory.Vehicles.Truck;

import FactoryPattern.VehicleFactory.Vehicles.Vehicle;
import FactoryPattern.VehicleFactory.Vehicles.VehicleFactory;

public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle CreateVehicle(String vehicleType) {
        if(vehicleType=="Regular"){
            System.out.println("Regular truck called");
            return new TruckRegular();
        }
        else{
            System.out.println("Regular truck called");
            return new TruckModified();
        }
    }
    
}
