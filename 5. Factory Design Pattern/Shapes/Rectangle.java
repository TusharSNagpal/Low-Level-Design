package Shapes;

public class Rectangle implements DesignShape{
    //is-a DesignShape
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
