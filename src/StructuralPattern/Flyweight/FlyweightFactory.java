package StructuralPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    /**
     * 唯一的factory实例
     */
    private static FlyweightFactory factory = new FlyweightFactory();

    /**
     * 用于保存享元对象的map
     */
    private Map<String, Flyweight> flyweights = new HashMap<>();

    private FlyweightFactory() {}

    public static FlyweightFactory getInstace() {
        return factory;
    }

    public Flyweight getWhiteFlyweight(String x) {
        String key = x + "-White";
        Flyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(ConcreteFlyweight.Color.WHITE);
            flyweight.operation(x);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

    public Flyweight getBlackFlyweight(String x) {
        String key = x + "-Black";
        Flyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(ConcreteFlyweight.Color.BLACK);
            flyweight.operation(x);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
