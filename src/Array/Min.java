package Array;
import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        int[] arr={70,30,20,40,2,100};
//        Arrays.sort(arr);
//        System.out.println(arr[0]);
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
