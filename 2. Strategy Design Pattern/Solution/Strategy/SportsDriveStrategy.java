package Solution.Strategy;

import Solution.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("SPORTS Capability Vehicle: MUSTANG GT");
        return;
    }
}
