package CreationalPattern.FactoryMethod.Factory;

import CreationalPattern.FactoryMethod.Product.Product;
import CreationalPattern.FactoryMethod.Product.ProductB;

public class FactoryB implements Factory {
    @Override
    public Product concreteProduct() {
        return new ProductB();
    }
}
