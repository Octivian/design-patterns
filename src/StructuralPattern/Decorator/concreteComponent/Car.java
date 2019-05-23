package StructuralPattern.Decorator.concreteComponent;

import StructuralPattern.Decorator.component.Transformer;

public class Car implements Transformer {
    @Override
    public void move() {
        System.out.println("以汽车速度移动");
    }
}
