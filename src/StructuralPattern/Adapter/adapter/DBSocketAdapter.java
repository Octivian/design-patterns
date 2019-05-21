package StructuralPattern.Adapter.adapter;

import StructuralPattern.Adapter.target1.DBsocketInterface;
import StructuralPattern.Adapter.adaptee.GBSocketInterface;

public class DBSocketAdapter implements DBsocketInterface {

    private GBSocketInterface gbSocket;

    public DBSocketAdapter(GBSocketInterface gbSocket){
        this.gbSocket=gbSocket;
    }

    @Override
    public void powerWithTwoRound() {
        gbSocket.powerWithThreeRound();
    }
}
