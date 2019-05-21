package StructuralPattern.Adapter.client;

import StructuralPattern.Adapter.target1.DBsocketInterface;

public class Hotel {
    private DBsocketInterface socket;

    public Hotel(DBsocketInterface socket){
        this.socket=socket;
    }

    public void charge(){
        socket.powerWithTwoRound();
    }

}
