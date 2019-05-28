package StructuralPattern.Proxy.dynamicProxy;

import StructuralPattern.Proxy.staticProxy.RealSubject;
import StructuralPattern.Proxy.staticProxy.Subject;

/**
 * 静态代理 静态代理类：由程序员创建或者由第三方工具生成，再进行编译；在程序运行之前，代理类的.class文件已经存在了。 静态代理类通常只代理一个类。 静态代理事先知道要代理的是什么。 3.动态代理
 * 动态代理类：在程序运行时，通过反射机制动态生成。 动态代理类通常代理接口下的所有类。 动态代理事先不知道要代理的是什么，只有在运行的时候才能确定。
 * 动态代理的调用处理程序必须事先InvocationHandler接口，及使用Proxy类中的newProxyInstance方法动态的创建代理类。 Java动态代理只能代理接口，要代理类需要使用第三方的CGLIB等类库。
 */
public class Main {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = new DynamicProxyHandler(realSubject).getProxy();
        proxy.doSomething();
    }
}
