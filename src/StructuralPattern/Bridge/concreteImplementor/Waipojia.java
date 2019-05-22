package StructuralPattern.Bridge.concreteImplementor;

import StructuralPattern.Bridge.implementor.Restaurant;

public class Waipojia implements Restaurant {
    @Override
    public String taste() {
        return "beef is bad";
    }
}
