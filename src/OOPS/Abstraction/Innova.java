package OOPS.Abstraction;

public class Innova extends Car{
    public void run(){
        System.out.println("Innova is running");
    }
    public static void main(String[] args) {
        Innova innova = new Innova();
        innova.run();
    }
}
