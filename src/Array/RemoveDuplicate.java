package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
//        int j = 0;
//        for(int i=1;i<arr.length;i++){
//            if(arr[i] != arr[j]){
//                j++;
//                arr[j] = arr[i];
//            }
//        }
//        for(int i = 0; i <= j; i++){
//            System.out.print(arr[i] + " ");
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
//        arr=Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(arr));
        }
    }
