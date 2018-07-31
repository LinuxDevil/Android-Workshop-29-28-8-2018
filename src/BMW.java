public class BMW extends Vehicle{

    int RPM = 4;
    int gear = 2;

    @Override
    public int shiftGear(){
        gear = gear + 1;
//        gear++;
//        ++gear;
        return gear;
    }

}
