package Problem;

class SportsVehicle extends VehicleDesign{
    @Override
    //duplicate code same as Offroad vehicle.
    //Lets say we have many methods we have to write each method in both the classes --> Code Duplicacy.
    //We need to solve this problem using Strategy Design Pattern..
    public void drive(){
        System.out.println("Special Drive Capability");
        return;
    }
}