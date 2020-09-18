package battleships;

public class Ship {
    String shipName;

    public Ship(String name){
        this.shipName = name;
    }

    public void setShipName(String sName){
        shipName = sName;
    }

    public String getShipName(){
        return shipName;
    }

}
