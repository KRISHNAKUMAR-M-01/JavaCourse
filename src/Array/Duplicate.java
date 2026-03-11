package Array;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,20,50,70,10};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
