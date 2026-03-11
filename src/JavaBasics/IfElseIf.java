package JavaBasics;
public class IfElseIf {
    public static void main(String[] args) {
        int val=80;
        if (val>=90){
            System.out.println("A Grade");
        } else if (val>=75 && val<=89) {
            System.out.println("B Grade");
        } else if (val>=50 && val<=74) {
            System.out.println("C Grade");
        }
        else {
            System.out.println("Fail");
        }

    }
}
