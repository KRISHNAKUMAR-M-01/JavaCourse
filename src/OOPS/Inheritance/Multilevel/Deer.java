package OOPS.Inheritance.Multilevel;

public class Deer extends Animal {
    String name;
    public String Name(String name){
        return name;
    }
    public void jump() {
        System.out.println("Deer is jumping");
    }
    public static void main(String[] args) {
        Deer d = new Deer();
        d.jump();
        d.run();
        d.sleep();
        System.out.println("Number of legs = " + d.legs);
        Animal a = new Animal();
        a.run();
        a.sleep();
    }
}

