package StructuralPattern.Bridge.abstraction;

import StructuralPattern.Bridge.implementor.Restaurant;

public abstract class Area {
    protected Restaurant restaurant;

    protected Area(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public abstract void commentTaste();
}
