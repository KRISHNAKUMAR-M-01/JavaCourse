package String;

enum Color {
    red,
    green,
    blue;
}

public class EnumToString {
    public static void main(String[] args) {
        System.out.println(Color.red.toString());
        System.out.println(Color.green.toString());
        System.out.println(Color.blue.toString());//or name() method

    }
}
