package VehicleStandards;

public class Normal implements VehicleStandard{
    @Override
    public String select() {
        System.out.println("Normal Vehicle Type Selected.");
        return "NORMAL";
    }
}
