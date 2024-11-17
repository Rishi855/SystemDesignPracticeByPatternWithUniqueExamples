package FactoryPattern.VehicleFactory.Vehicles.Truck;

import FactoryPattern.VehicleFactory.Vehicles.Vehicle;

public class TruckRegular implements Vehicle{


    @Override
    public Vehicle GetDispatch() {
        System.out.println("Bike Dispatched");
        return this;
    }

    @Override
    public Vehicle Manufacture() {
        System.out.println("Bike Manufacture");
        return this;
    }

    @Override
    public Vehicle SetNumberPlate() {
        System.out.println("Bike Set number plate");
        return this;
    }

    @Override
    public Vehicle SendShowroom() {
        System.out.println("Bike send showroom");
        return this;
    }

    @Override
    public Vehicle ReadyForDelhiver() {
        System.out.println("Bike Ready for delhiver");
        return this;
    }

}
