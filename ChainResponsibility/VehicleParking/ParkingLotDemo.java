package ChainResponsibility.VehicleParking;

import ChainResponsibility.VehicleParking.VehiclesType.*;

public class ParkingLotDemo {
    public void run(){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 120));
        parkingLot.addLevel(new Level(3, 150));

        Vehicle car = new Car("MH12RD3232");
        Vehicle bike = new MotorBike("MH01ED2343");
        Vehicle truck = new Truck("MH04ED2323");
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        parkingLot.displayAvaliable();

        parkingLot.unparkVehicle(bike);

        parkingLot.displayAvaliable();
    }
}
