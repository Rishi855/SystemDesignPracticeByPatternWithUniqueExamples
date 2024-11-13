package VehicleParking;

import java.util.ArrayList;
import java.util.List;

import VehicleParking.VehiclesType.Vehicle;

public class ParkingLot {
    public static ParkingLot instance;
    public final List<Level> levels;

    private ParkingLot(){
        levels = new ArrayList<>();
    }
    public static ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }
    public void addLevel(Level level){
        levels.add(level);
    }
    public boolean parkVehicle(Vehicle vehicle){
        for(Level level : levels){
            if(level.parkVehicle(vehicle)){
                System.out.println("Vehicle parked successfully.");
                return true;
            }
        }
        System.out.println("Could not park vehicle.");
        return false;
    }
    public boolean unparkVehicle(Vehicle vehicle){
        for(Level level: levels){
            if(level.unparkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }
    public void displayAvaliable(){
        for(Level level: levels){
            level.displayAvaliable();
        }
    }
}