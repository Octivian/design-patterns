package StructuralPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CompositeConcreteFlyweight implements Flyweight {

    Map<String, Flyweight> flyweights = new HashMap<>();

    @Override
    public void operation(String extrinsicState) {
        for (Map.Entry<String, Flyweight> entry : flyweights.entrySet()) {
            entry.getValue().operation(extrinsicState);
        }
    }

    public void add(String state, Flyweight flyweight) {
        flyweights.put(state, flyweight);
    }

    public void remove(String state) {
        flyweights.remove(state);
    }
}
