package VehicleParking;

import VehicleParking.VehiclesType.VehicleType;
import VehicleParking.VehiclesType.Vehicle;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    ParkingSpot(int spotNumber,VehicleType vehicleType){
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }
    public boolean isAvaliable(){
        return parkedVehicle == null;
    }
    public void parkVehicle(Vehicle vehicle){
        if(isAvaliable() && vehicleType==vehicle.getType()){
            parkedVehicle = vehicle;
        }
        else{
            throw new IllegalArgumentException("Invalid spot or vehicle");
        }
    }
    public void unparkVehicle(){
        parkedVehicle = null;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }
    public int getSpotNumber(){
        return spotNumber;
    }

}
