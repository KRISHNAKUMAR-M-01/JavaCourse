package OOPS.Polymorphism;

public class Overrides extends OverRiding {
//    @Override
    public void run(){
        System.out.println("OverRiding");
    }
    public static void main(String[] args)
    {
        Overrides obj = new Overrides();
        obj.run();

    }
}
