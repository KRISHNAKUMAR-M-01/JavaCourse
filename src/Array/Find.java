package Array;
public class Find {
    public static void main(String[] args) {
        int[] a={2,3,4,5,7,2,5,8};
        int target=7;
//        for(int i=0;i<a.length;i++)
          int i=0;
          while( i<a.length){
            if(a[i]==target){
                System.out.println("the target "+target+" is found in "+(i+1));
            }
            i++;
          }
    }
}
