package Solution;

import Solution.Strategy.OffroadDriveStrategy;
import Solution.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends VehicleDesign {
    OffroadVehicle(){
        super(new OffroadDriveStrategy());
    }
}