package abstractFactoryDP;

public class YModel implements Car{
    @Override
    public String getModelName() {
        return "model y";
    }

    @Override
    public String getPrice() {
        return "30000";
    }
}
