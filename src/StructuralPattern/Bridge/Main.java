package StructuralPattern.Bridge;

import StructuralPattern.Bridge.abstraction.Area;
import StructuralPattern.Bridge.concreteImplementor.Waipojia;
import StructuralPattern.Bridge.concreteImplementor.Xiaonanguo;
import StructuralPattern.Bridge.implementor.Restaurant;
import StructuralPattern.Bridge.refinedAbstraction.Beijing;
import StructuralPattern.Bridge.refinedAbstraction.Xian;

/**
 * 组合的方式，生成不同维度组合的对象
 */
public class Main {
    public static void main(String[] args) {
        Restaurant xiaonanguo = new Xiaonanguo();
        Area beijingXiaonanguo = new Beijing(xiaonanguo);
        beijingXiaonanguo.commentTaste();

        Restaurant waipojia = new Waipojia();
        Area xianWaipojia = new Xian(waipojia);
        xianWaipojia.commentTaste();
    }
}
