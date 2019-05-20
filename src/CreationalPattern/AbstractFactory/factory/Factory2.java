package CreationalPattern.AbstractFactory.factory;

import CreationalPattern.AbstractFactory.productA.ProductA;
import CreationalPattern.AbstractFactory.productA.ProductA2;
import CreationalPattern.AbstractFactory.productB.ProductB;
import CreationalPattern.AbstractFactory.productB.ProductB2;

public class Factory2 implements Factory {
    @Override
    public ProductA concreteProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB concreteProductB() {
        return new ProductB2();
    }
}
