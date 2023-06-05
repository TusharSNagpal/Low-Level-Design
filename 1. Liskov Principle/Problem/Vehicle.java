package Problem;

abstract class Vehicle{
    public Integer numberOfWheels(){
        return 2;
    }
    
    public String engineGearBox(){
        return "5-speed";
    }

    //duplicate code same as Sproty vehicle.
    //Lets say we have many methods we have to write each method in both the classes --> Code Duplicacy.
    //We need to solve this problem using Strategy Design Pattern..
}