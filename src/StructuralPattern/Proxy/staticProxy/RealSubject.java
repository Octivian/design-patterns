package StructuralPattern.Proxy.staticProxy;

public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("real do something");
    }
}
