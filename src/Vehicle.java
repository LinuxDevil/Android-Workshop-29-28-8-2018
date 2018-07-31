public class Vehicle {

    public int RPM = 0;
    public int gear = 1;


    public boolean isOn(){
        return true;
    }

    public boolean isOff(){
        return false;
    }

    public int shiftGear(){
        gear = gear + 1;
//        gear++;
//        ++gear;
        return gear;
    }

}
