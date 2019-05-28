package StructuralPattern.Proxy.staticProxy;

public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.doSomething();
    }
}
