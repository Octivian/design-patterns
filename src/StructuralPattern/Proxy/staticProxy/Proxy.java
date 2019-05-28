package StructuralPattern.Proxy.staticProxy;

public class Proxy implements Subject {

    Subject realSubject;

    public Proxy(Subject subject) {
        this.realSubject = subject;
    }

    protected void preDoSomething() {}

    protected void postDoSomething() {}

    @Override
    public void doSomething() {
        preDoSomething();
        realSubject.doSomething();
        postDoSomething();
    }
}
