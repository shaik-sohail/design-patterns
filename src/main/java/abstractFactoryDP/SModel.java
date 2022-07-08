package abstractFactoryDP;

public class SModel implements Car{
    @Override
    public String getModelName() {
        return "Model S";
    }

    @Override
    public String getPrice() {
        return "20000";
    }
}
