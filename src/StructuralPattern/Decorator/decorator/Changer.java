package StructuralPattern.Decorator.decorator;

import StructuralPattern.Decorator.component.Transformer;

public abstract class Changer implements Transformer {
    Transformer transformer;

    public Changer(Transformer transformer) {
        this.transformer = transformer;
    }

    @Override
    public void move() {
        transformer.move();
    }
}
