package abstractFactoryDP;

public class SpaceXFactory implements AbstractFactory<Rocket>{

    @Override
    public Rocket create(String type) {
        if("falcon".equalsIgnoreCase(type)){
            return new Falcon();
        } else if ("mars".equalsIgnoreCase(type)) {
            return new RedMercury();
        }
        return null;
    }
}
