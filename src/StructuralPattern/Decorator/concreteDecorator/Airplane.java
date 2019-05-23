package StructuralPattern.Decorator.concreteDecorator;

import StructuralPattern.Decorator.component.Transformer;
import StructuralPattern.Decorator.decorator.Changer;

public class Airplane extends Changer {
    public Airplane(Transformer transformer) {
        super(transformer);
    }

    @Override
    public void move() {
        super.move();
    }

    public void fly() {}
}
