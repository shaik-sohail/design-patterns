package prototypeDesignPattern;

public class Legacy extends MobilePrototype{

    @Override
    public void information(){
        System.out.println("Legacy model with polo software added");
    }

    public Legacy(){
        this.softwareName = "polo";
        this.modelName = "legacy";
    }

}
