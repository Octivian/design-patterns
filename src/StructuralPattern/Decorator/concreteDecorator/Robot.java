package StructuralPattern.Decorator.concreteDecorator;

import StructuralPattern.Decorator.component.Transformer;
import StructuralPattern.Decorator.decorator.Changer;

public class Robot extends Changer {
    public Robot(Transformer transformer) {
        super(transformer);
    }

    @Override
    public void move() {
        super.move();
    }

    public void say() {}
}
