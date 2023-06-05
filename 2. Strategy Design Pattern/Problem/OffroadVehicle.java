package Problem;

class OffroadVehicle extends VehicleDesign{
    //duplicate code same as Sporty vehicle.
    //Lets say we have many methods we have to write each method in both the classes --> Code Duplicacy.
    //We need to solve this problem using Strategy Design Pattern..
    @Override
    public void drive(){
        System.out.println("Special Drive Capability");
    }
}