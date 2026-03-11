package Array;
public class TwoDimentional {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][0]=60;
        arr[0][1]=40;
        arr[2][1]=60;
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<arr[j].length;i++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
