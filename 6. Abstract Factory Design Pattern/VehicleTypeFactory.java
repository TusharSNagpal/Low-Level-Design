import VehicleStandards.Luxury;
import VehicleStandards.Normal;
import VehicleStandards.VehicleStandard;

public class VehicleTypeFactory {
    VehicleStandard getVehicleStandard(String standard){
        switch(standard){
            case "LUXURY":
                return new Luxury();
            case "NORMAL":
                return new Normal();
            default:
                return null;
        }
    }
}
