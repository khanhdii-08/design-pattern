package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Blue;
import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.color.Green;
import abstract_factory_pattern.color.Red;
import abstract_factory_pattern.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
