package CreationalPattern.AbstractFactory.factory;

import CreationalPattern.AbstractFactory.productA.ProductA;
import CreationalPattern.AbstractFactory.productA.ProductA1;
import CreationalPattern.AbstractFactory.productB.ProductB;
import CreationalPattern.AbstractFactory.productB.ProductB1;

public class Factory1 implements Factory {
    @Override
    public ProductA concreteProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB concreteProductB() {
        return new ProductB1();
    }
}
