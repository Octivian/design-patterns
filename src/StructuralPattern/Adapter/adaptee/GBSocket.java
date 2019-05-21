package StructuralPattern.Adapter.adaptee;

public class GBSocket implements GBSocketInterface {
    @Override
    public void powerWithThreeRound() {
        System.out.println("国标三相充电");
    }
}
