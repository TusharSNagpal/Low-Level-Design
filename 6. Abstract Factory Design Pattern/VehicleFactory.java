import VehicleStandards.VehicleStandard;
import Vehicles.Mercedes;
import Vehicles.Seltos;
import Vehicles.Vehicle;

import java.util.Scanner;

public class VehicleFactory {
    Vehicle getVehicle(VehicleStandard standardType){
        Scanner sc = new Scanner(System.in);
        String standard = standardType.select();

        switch (standard) {
            case "LUXURY": {
                System.out.println("SELECT OUT OF LUXURY VEHICLES:");
                System.out.println("1. Mercedes");
                int v = sc.nextInt();
                if (v == 1) {
                    return new Mercedes();
                }
            }

            case "NORMAL": {
                System.out.println("SELECT OUT OF NORMAL VEHICLES:");
                System.out.println("1. Seltos");
                int v = sc.nextInt();
                if (v == 1) {
                    return new Seltos();
                }
            }

            default:
                return null;
        }
    }
}
