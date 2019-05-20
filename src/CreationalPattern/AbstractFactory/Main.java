package CreationalPattern.AbstractFactory;

import CreationalPattern.AbstractFactory.factory.Factory1;

/**
 * 抽象工厂模式，对象对应两种维度，族，等级
 *
 * <p>具体的工厂对应同一族对象的创建
 *
 * <p>新加产品族，只需新加具体的工厂，但新加产品等级，就要对抽象工厂和所有实现具体工厂都要修改
 *
 * <p>族对应1，2，等级对应A，B
 */
public class Main {

    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        factory1.concreteProductA();
    }
}
