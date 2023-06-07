package Shapes;

public class Square implements DesignShape{
    //is-a DesignShape
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
