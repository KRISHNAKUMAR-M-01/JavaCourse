package OOPS.Polymorphism.Example;

public class Child extends Parent {
    static void show(){
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        Parent p = new Child();
        show();
        p.show();
        Parent.show();
    }
}
