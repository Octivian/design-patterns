package CreationalPattern.singleton;

public class EagerSingleton {

    private static final EagerSingleton obj = new EagerSingleton();

    private EagerSingleton() {}

    static EagerSingleton getInstace() {
        return obj;
    }
}
