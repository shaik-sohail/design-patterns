package abstractFactoryDP;

public  class TeslaFactory implements AbstractFactory<Car>{

    @Override
    public Car create(String type) {
        if("s".equalsIgnoreCase(type)){
                return new SModel();
        } else if ("y".equalsIgnoreCase(type)) {
            return new YModel();
        }
        else return null;
    }
}
