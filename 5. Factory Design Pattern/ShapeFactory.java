import Shapes.CircleImpl;
import Shapes.DesignShape;
import Shapes.Rectangle;
import Shapes.Square;

public class ShapeFactory {
    DesignShape getShape(String input){
        switch (input) {
            case "CIRCLE":
                return new CircleImpl();

            case "RECTANGLE":
                return new Rectangle();

            case "SQUARE":
                return new Square();

            default:
                return null;
        }
    }
}
