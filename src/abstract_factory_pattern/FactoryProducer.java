package abstract_factory_pattern;

import abstract_factory_pattern.factory.AbstractFactory;
import abstract_factory_pattern.factory.ColorFactory;
import abstract_factory_pattern.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
