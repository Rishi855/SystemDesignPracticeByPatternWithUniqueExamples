package FactoryPattern.VehicleFactory.Vehicles;

public abstract class VehicleFactory {
    Vehicle vehicle;
    public Vehicle OrderVehicle(String vehicleType){
        vehicle = CreateVehicle(vehicleType)
                .Manufacture()
                .GetDispatch()
                .SendShowroom();

        return vehicle;
    }

    public abstract Vehicle CreateVehicle(String vehicleType);
}
