import Shapes.DesignShape;

public class User {
    public static void main(String args[]) {
        //main
        ShapeFactory shape = new ShapeFactory(); //has-a
        DesignShape circle = shape.getShape("CIRCLE");
        DesignShape square = shape.getShape("SQUARE");
        DesignShape rectangle = shape.getShape("RECTANGLE");

        square.draw();
    }
}
