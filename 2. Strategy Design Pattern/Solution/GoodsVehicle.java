package Solution;

import Solution.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends VehicleDesign{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
