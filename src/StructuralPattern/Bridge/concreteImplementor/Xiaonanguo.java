package StructuralPattern.Bridge.concreteImplementor;

import StructuralPattern.Bridge.implementor.Restaurant;

public class Xiaonanguo implements Restaurant {
    @Override
    public String taste() {
        return "beef is good";
    }
}
