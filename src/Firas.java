public class Firas extends Human implements Contract{

    /*
        Class User
        Map username password
        getPassword(username)
        setUsername(username)

        //Ali con
        //132 , 534

        Interface Location
        getUserLocation
        setUserLocation(double, double)

     */





    String name;

    public Firas(String hairColor, int weight, boolean isAlive){
        super(hairColor,weight,isAlive);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override public void setName(String name){
       this.name = name;
    }

    @Override
    public void run(){
        System.out.println("is Running in Firas");
    }

}
