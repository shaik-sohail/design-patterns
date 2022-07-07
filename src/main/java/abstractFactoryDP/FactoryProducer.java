package abstractFactoryDP;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("SpaceX".equalsIgnoreCase(choice)){
            return new SpaceXFactory();
        }
        else if("Tesla".equalsIgnoreCase(choice)){
            return new TeslaFactory();
        }

        return null;
    }
}
