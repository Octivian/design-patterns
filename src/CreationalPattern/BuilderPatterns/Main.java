package CreationalPattern.BuilderPatterns;

/**
 * 具体的Builder作为，具体产品的建造说明书（实现具体的方法），而Director作为具体的建造者，调用具体Builder来建造
 *
 * <p>所以客户端直接给建造者Director，指定要哪个Builder，直接获取具体Build出的产品
 */
public class Main {

    public static void main(String[] args) {
        Builder b = new ConcreteBuilder();
        Director.construct(b);
        Product instance = b.getInstance();
    }
}
