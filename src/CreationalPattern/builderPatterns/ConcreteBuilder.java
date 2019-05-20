package CreationalPattern.builderPatterns;

public class ConcreteBuilder implements Builder {

    ProductA p = new ProductA();

    @Override
    public void buildPartA() {
        p.partA = "add partA";
    }

    @Override
    public void buildPartB() {
        p.partB = "add partB";
    }

    @Override
    public void buildPartC() {
        p.partC = "add partC";
    }

    @Override
    public Product getInstance() {
        return p;
    }
}
