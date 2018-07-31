public class Human {


    public String hairColor;
    public int weight;
    private boolean isAlive;

    public Human(String hairColor, int weight, boolean isAlive){
        System.out.println("is Alive and created");
        this.hairColor = hairColor;
        this.weight = weight;
        this.isAlive = isAlive;

        System.out.println(this.hairColor);
        System.out.println(this.weight);
        System.out.println(this.isAlive);
    }

    public void eat(){
        System.out.println("is Eating");
    }

    public void sleep(){
        System.out.println("is Sleeping");
    }

    public void run(){
        System.out.println("is Running");
    }

    boolean isHungry(){
        return false;
    }

}
