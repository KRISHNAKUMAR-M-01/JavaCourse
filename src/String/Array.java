package String;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        System.out.println("Array Example");
        String str="Hello World";
        String[] arr=str.split(" ");
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }
}
