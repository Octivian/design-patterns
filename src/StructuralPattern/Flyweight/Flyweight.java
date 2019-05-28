package StructuralPattern.Flyweight;

/**
 * 以围棋为例，棋子颜色，大小都是内部属性，都是COMMON的 外部属性为坐标，都不同
 */
public interface Flyweight {

    void operation(String x);
}
