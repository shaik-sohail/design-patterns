package abstractFactoryDP;

/*
Abstract Factory patterns work around a super-factory which creates other factories.
This factory is also called as factory of factories.
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to
create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects
without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 */

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = FactoryProducer.getFactory("Spacex");
        Rocket falcon =  (Rocket) factory1.create("Falcon");
        System.out.println(falcon.getRocketName());
        System.out.println(falcon.getRocketSoftware());
        AbstractFactory factory2 = FactoryProducer.getFactory("Tesla");
        Car y = (Car) factory2.create("y");
        System.out.println(y.getModelName());
        System.out.println(y.getPrice());
    }
}
