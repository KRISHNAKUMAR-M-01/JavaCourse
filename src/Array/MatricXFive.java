package Array;
public class MatricXFive {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{2,3,4}};
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print((mat[i][j]*5)+" ");
            }
            System.out.println();
        }

    }
}
