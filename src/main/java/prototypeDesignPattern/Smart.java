package prototypeDesignPattern;

public class Smart extends MobilePrototype{

    @Override
    public void information(){
        System.out.println("Smart model with sonu software added");
    }

    public Smart(){
        this.softwareName = "sonu";
        this.modelName = "Smart";
    }

}
