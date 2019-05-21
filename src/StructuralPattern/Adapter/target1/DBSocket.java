package StructuralPattern.Adapter.target1;

public class DBSocket implements DBsocketInterface {
    @Override
    public void powerWithTwoRound() {
        System.out.println("德标两相充电");
    }
}
