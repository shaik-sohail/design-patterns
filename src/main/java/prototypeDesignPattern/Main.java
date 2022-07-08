package prototypeDesignPattern;
/*
    The concept is to copy an existing object rather than creating a new instance from scratch,
 something that may include costly operations. The existing object acts as a prototype and contains the state of the object.
 The newly copied object may change same properties only if required. This approach saves costly resources and time,
 especially when object creation is a heavy process.
 */



public class Main {
    public static void main(String[] args) {
        MobileCache.getMobile("Legacy").information();
        MobileCache.getMobile("Smart").information();
    }
}
