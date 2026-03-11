package Array;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={10,30,40,70,100};
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("sorted array");
        }
        else{
            System.out.println("not sorted array");
        }

    }
}
