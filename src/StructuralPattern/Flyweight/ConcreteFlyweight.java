package StructuralPattern.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    public enum Color {
        WHITE,
        BLACK
    }

    /**
     * 内部状态
     */
    private Color color;

    /**
     * 构造方法，并设置内部状态.
     *
     * @param color
     */
    public ConcreteFlyweight(Color color) {
        this.color = color;
    }

    /**
     * 由外部控制外部状态
     */
    @Override
    public void operation(String x) {
        System.out.println("棋子颜色:" + color);
        System.out.println("坐标：" + x);
    }
}
