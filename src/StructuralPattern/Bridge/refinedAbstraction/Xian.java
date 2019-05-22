package StructuralPattern.Bridge.refinedAbstraction;

import StructuralPattern.Bridge.abstraction.Area;
import StructuralPattern.Bridge.implementor.Restaurant;

public class Xian extends Area {

    public Xian(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void commentTaste() {
        System.out.println("Xian" + super.restaurant.taste());
    }
}
