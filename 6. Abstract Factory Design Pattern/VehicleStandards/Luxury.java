package VehicleStandards;

public class Luxury implements VehicleStandard{
    public String select(){
        System.out.println("Luxury Vehicle Type Selected.");
        return "LUXURY";
    }
}
