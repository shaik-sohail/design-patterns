package abstractFactoryDP;

public class Falcon implements Rocket{
    @Override
    public String getRocketName() {
        return "Falcon-9";
    }

    @Override
    public String getRocketSoftware() {
        return "alpha-century";
    }
}
