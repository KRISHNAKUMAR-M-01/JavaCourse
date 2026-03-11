package OOPS.Polymorphism;

public class MethodOverloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public double add(double a,double b,double c,double d){
        return a+b+c+d;

    }public static  void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.add(1,5));
        System.out.println(mo.add(1,5,6));
        System.out.println(mo.add(33.5d,67.9d,56.56d,87.45d));
    }
}
