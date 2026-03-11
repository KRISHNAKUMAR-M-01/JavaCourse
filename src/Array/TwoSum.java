package Array;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={10,20,70,60,100,120,30};
        int target=150;
        for(int num:arr){
            for(int i=0;i<arr.length;i++){
                if(num+arr[i]==target){
                    System.out.println(num+" "+arr[i]);
                }
            }

        }
    }
}
