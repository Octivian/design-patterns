package CreationalPattern.SimpleFactory;

public class Factory {
    /**
     * 潜在问题：增加产品时，需修改工厂的静态方法，不符合开闭原则
     */
    static Product concreteProdcut(String name) {
        if (name.equals("A")) {
            return new ProductA();
        } else if (name.equals("B")) {
            return new ProductB();
        }
        return null;
    }
}
