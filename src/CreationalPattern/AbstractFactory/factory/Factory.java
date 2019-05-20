package CreationalPattern.AbstractFactory.factory;

import CreationalPattern.AbstractFactory.productA.ProductA;
import CreationalPattern.AbstractFactory.productB.ProductB;

public interface Factory {
    ProductA concreteProductA();

    ProductB concreteProductB();
}
