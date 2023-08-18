import VehicleStandards.VehicleStandard;
import Vehicles.Vehicle;

public class User1 {
    public static void main(String args[]) {
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        VehicleStandard vehicleStandard = vehicleTypeFactory.getVehicleStandard("NORMAL");

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle(vehicleStandard);

        vehicle.selectVehicle();
    }
}
