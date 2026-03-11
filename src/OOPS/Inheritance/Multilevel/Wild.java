package OOPS.Inheritance.Multilevel;

public class Wild extends Deer {
    public void wildAnimal()
    {
        System.out.println("WildAnimal");
    }
    public void run(){
        System.out.println("Deer is Running");
    }
    public void sleep()
    {
        System.out.println("Deer is Sleeping");
    }
    public static void main(String[] args) {
        Wild w = new Wild();
        w.wildAnimal();
        System.out.println(w.Name("dear"));
        w.run();
        w.sleep();
        w.jump();
        System.out.println("Number of legs = " + w.legs);

    }

}

