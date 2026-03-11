package String;

public class InsertString {
    public static void main(String[] args) {
        String original="Insert String";
        String newString="a";
        int position=7;
        String result=original.substring(0,position)+newString+original.substring(position-1);
        System.out.println(result);
    }
}
