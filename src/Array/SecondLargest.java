package Array;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={10,20,100,70,50,80};
        int first=arr[0];
        int second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second &&arr[i]!=first){
                second=arr[i];
            }

        }
        System.out.println(second);
    }
}
