package StructuralPattern.Decorator;

import StructuralPattern.Decorator.component.Transformer;
import StructuralPattern.Decorator.concreteComponent.Car;
import StructuralPattern.Decorator.concreteDecorator.Airplane;
import StructuralPattern.Decorator.decorator.Changer;

public class Main {
    public static void main(String[] args) {
        Transformer car = new Car();
        Changer airplane = new Airplane(car);
        airplane.move();
    }
}
