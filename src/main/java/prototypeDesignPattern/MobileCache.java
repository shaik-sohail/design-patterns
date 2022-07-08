package prototypeDesignPattern;
import java.util.HashMap;
import java.util.Map;

public class MobileCache {
    private static Map<String, MobilePrototype> mobileMap = new HashMap<String, MobilePrototype>();
    static{
        mobileMap.put("Legacy",new Legacy());
        mobileMap.put("Smart",new Smart());
    }
    public static MobilePrototype getMobile(String modelName){
            return (MobilePrototype) mobileMap.get(modelName).clone();
    }

}
