package Solution.Strategy;

import Solution.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Capability: WagonR");
        return;
    }
}
