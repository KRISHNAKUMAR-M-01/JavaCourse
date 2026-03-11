package JavaBasics;

public class Leap {
    public static void main(String[] args) {
        int years = 2026;
        if (years % 4 == 0 || years % 400 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
