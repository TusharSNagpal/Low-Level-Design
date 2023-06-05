package Solution;

public class Main {
    public static void main(String args[]){
        VehicleDesign sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        VehicleDesign goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        VehicleDesign offRoadVehicle = new OffroadVehicle();
        offRoadVehicle.drive();
        //
    }
}
