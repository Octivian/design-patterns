package CreationalPattern.FactoryMethod;

import CreationalPattern.FactoryMethod.Factory.Factory;
import CreationalPattern.FactoryMethod.Factory.FactoryA;
import CreationalPattern.FactoryMethod.Product.Product;

/**
 * 工厂方法模式，增加新产品，不用改原有代码，直接增加对应的产品子类，及对应的工厂子类
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.concreteProduct();
    }
}
