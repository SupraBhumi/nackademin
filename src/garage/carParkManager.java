package garage;

public interface carParkManager {
    final int totalVehicleSlots = 20;
    boolean vehicleEntered(VehicleByRegNo V);              //konstant fält
    int vehicleLeft (String plate);

}
