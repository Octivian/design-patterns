package CreationalPattern.FactoryMethod.Factory;

import CreationalPattern.FactoryMethod.Product.Product;
import CreationalPattern.FactoryMethod.Product.ProductA;

public class FactoryA implements Factory {
    @Override
    public Product concreteProduct() {
        return new ProductA();
    }
}
