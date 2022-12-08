package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.shape.Circle;
import abstract_factory_pattern.shape.Rectangle;
import abstract_factory_pattern.shape.Shape;
import abstract_factory_pattern.shape.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
   public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
