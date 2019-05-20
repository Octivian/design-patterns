package CreationalPattern.Singleton;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton obj;

    private DoubleCheckSingleton() {}

    static DoubleCheckSingleton getInstance() {
        if (obj == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (obj == null) {
                    obj = new DoubleCheckSingleton();
                }
            }
        }
        return obj;
    }
}
