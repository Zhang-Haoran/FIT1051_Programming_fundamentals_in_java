public class Car {
    private int door;
    private boolean IsElectric;





    public void setIsElectric(boolean newElectric){
        IsElectric = newElectric;
    }

    public boolean getIsElectric(){
        return IsElectric;
    }

    public void setDoor(int newDoor) {     //mutator
        if(newDoor <=4 && newDoor >0){
        door = newDoor;
    }
    }

    public int getDoor() {                //accessor
        return door;
    }
}
