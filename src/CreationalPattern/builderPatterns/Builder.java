package CreationalPattern.builderPatterns;

public interface Builder {

    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getInstance();
}
