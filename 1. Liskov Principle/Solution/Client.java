package Solution;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        List<EngineGearbox> vehicleWithEngineList = new ArrayList<>();
        List<Vehicle> vehicleWithoutGearList = new ArrayList<>();


        vehicleWithEngineList.add(new MotorCycle());
        vehicleWithEngineList.add(new Car());

        vehicleWithoutGearList.add(new Bicycle());

        for (Vehicle vehicle : vehicleWithoutGearList) {
            //System.out.println(vehicle.engineGearBox().toString()); // --> Compilation Error it will not wait for runtime.
            // Since, no such method exists in vehicle : engineGearBox: IT will produce compile time error and will not allow client
            // to write such a code which will be difficult to change everywhere when required.
            System.out.println("Without Gear:");
            System.out.println(vehicle.numberOfWheels()); //--> This method is present in vehicle so no error
//            System.out.println(vehicle.engineGearbox()); //--> This method is not present in vehicle so error
        }

        for (EngineGearbox vehicleWithGear : vehicleWithEngineList) {
            //System.out.println(vehicle.engineGearBox().toString()); // --> Compilation Error it will not wait for runtime.
            // Since, no such method exists in vehicle : engineGearBox: IT will produce compile time error and will not allow client
            // to write such a code which will be difficult to change everywhere when required.
            System.out.println("With Gear:");
            System.out.println(vehicleWithGear.numberOfWheels()); //--> This method is present in vehicleWithGear so no error
            System.out.println(vehicleWithGear.engineGearBox()); //--> This method is present in vehicleWithGear so no error
        }
    }
    //This is how we seperated generic methods in parent class(Vehicle) and non-generic methods in sub classes(EngineGearbox).
}