package strategyDP;



public class Context {
    private Steering steering;
    public Context(Steering steering){
        this.steering=steering;
    }
    public void addSteering(){
        steering.functionality();
    }
}
