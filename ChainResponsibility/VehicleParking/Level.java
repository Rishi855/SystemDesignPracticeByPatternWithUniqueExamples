package ChainResponsibility.VehicleParking;

import java.util.ArrayList;
import java.util.List;

import ChainResponsibility.VehicleParking.VehiclesType.Vehicle;
import ChainResponsibility.VehicleParking.VehiclesType.VehicleType;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingSpot;

    public Level(int floor,int numSpots){
        this.floor = floor;
        parkingSpot = new ArrayList<>();
        double spotForBike = 0.50;
        double spotForCar = 0.40;

        int numBikes = (int) (numSpots*spotForBike);
        int numCars = (int) (numSpots*spotForCar);
        int numTruck = numSpots - numBikes - numCars;
        for(int i=0;i<=numBikes;i++){
            parkingSpot.add(new ParkingSpot(i, VehicleType.MOTORBIKE));
        }
        for(int i=numBikes+1;i<=numTruck;i++){
            parkingSpot.add(new ParkingSpot(i, VehicleType.CAR));
        }
        for(int i=numBikes+numCars;i<=numSpots;i++){
            parkingSpot.add(new ParkingSpot(i, VehicleType.TRUCK));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpot){
            if(spot.isAvaliable() && vehicle.getType() == spot.getVehicleType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot: parkingSpot){
            if(!spot.isAvaliable() && spot.getParkedVehicle().equals(vehicle)){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }
    public void displayAvaliable(){
        System.out.println("Level "+floor+ " Avaliability: ");
        for(ParkingSpot spot : parkingSpot){
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvaliable() ? "Available For"  : "Occupied By ")+" "+spot.getVehicleType());
        }
    }
}
