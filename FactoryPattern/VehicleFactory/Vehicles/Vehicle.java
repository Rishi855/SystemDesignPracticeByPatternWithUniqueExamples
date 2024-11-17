package FactoryPattern.VehicleFactory.Vehicles;

public interface Vehicle {
    Vehicle Manufacture();
    Vehicle GetDispatch();
    Vehicle SendShowroom();
    Vehicle SetNumberPlate();
    Vehicle ReadyForDelhiver();
}
