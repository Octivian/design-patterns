package StructuralPattern.Flyweight;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory f = FlyweightFactory.getInstace();
        Flyweight a = f.getBlackFlyweight("1,2");
        Flyweight b = f.getBlackFlyweight("1,2");
        System.out.println(a == b);
    }
}
