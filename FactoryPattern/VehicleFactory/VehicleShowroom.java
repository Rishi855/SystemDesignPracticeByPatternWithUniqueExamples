package FactoryPattern.VehicleFactory;
import FactoryPattern.VehicleFactory.Vehicles.Vehicle;
import FactoryPattern.VehicleFactory.Vehicles.Bike.BikeFactory;
import FactoryPattern.VehicleFactory.Vehicles.Car.CarFactory;
import FactoryPattern.VehicleFactory.Vehicles.Truck.TruckFactory;
public class VehicleShowroom {

    Vehicle vehicleOrdered;
    String vehicle,vehicleType;
    public VehicleShowroom(String vehicle, String vehicleType) {
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
    }

    public void PlaceOrder() {
        if(vehicle.equals("Car")){
            vehicleOrdered = new CarFactory().OrderVehicle(vehicleType);
        }
        else if(vehicle.equals("Bike")){
            vehicleOrdered = new BikeFactory().OrderVehicle(vehicleType);
        }
        else{
            vehicleOrdered = new TruckFactory().OrderVehicle(vehicleType);
        }
    }
    
}
