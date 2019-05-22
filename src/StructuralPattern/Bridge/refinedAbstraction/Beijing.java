package StructuralPattern.Bridge.refinedAbstraction;

import StructuralPattern.Bridge.abstraction.Area;
import StructuralPattern.Bridge.implementor.Restaurant;

public class Beijing extends Area {

    public Beijing(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void commentTaste() {
        System.out.println("Beijing" + super.restaurant.taste());
    }
}
