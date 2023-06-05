package Solution;

import Solution.Strategy.SportsDriveStrategy;

class SportsVehicle extends VehicleDesign {
    SportsVehicle(){
        super (new SportsDriveStrategy());
    }
}