package CreationalPattern.builderPatterns;

public class Director {
    static void construct(Builder b) {
        b.buildPartA();
        b.buildPartB();
        b.buildPartC();
    }
}
