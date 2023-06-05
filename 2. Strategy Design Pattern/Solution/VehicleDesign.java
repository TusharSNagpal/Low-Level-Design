package Solution;

public class VehicleDesign {
    DriveStrategy driveObject;
    //constructor injection:
    VehicleDesign(DriveStrategy driveObject){
        this.driveObject = driveObject;
    }
    public void drive() {
        driveObject.drive();
    }
}