package StructuralPattern.Adapter;

import StructuralPattern.Adapter.client.Hotel;
import StructuralPattern.Adapter.target.DBSocket;
import StructuralPattern.Adapter.target.DBsocketInterface;
import StructuralPattern.Adapter.adaptee.GBSocket;
import StructuralPattern.Adapter.adaptee.GBSocketInterface;
import StructuralPattern.Adapter.adapter.DBSocketAdapter;

public class Main {
  public static void main(String[] args) {
    DBsocketInterface dbSocket = new DBSocket();
    Hotel hotel = new Hotel(dbSocket);
    hotel.charge();


    GBSocketInterface gbSocket = new GBSocket();
    DBSocketAdapter adapter = new DBSocketAdapter(gbSocket);
    Hotel hotel1 = new Hotel(adapter);
    hotel1.charge();
  }
}
