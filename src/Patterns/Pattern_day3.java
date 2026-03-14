package Patterns;

public class Pattern_day3 {
    public static void main(String[] args) {
        String a="ABCD";
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a.charAt(i) +" ");
            }
            System.out.println();
//            A A A A
//            B B B B
//            C C C C
//            D D D D


        }
        System.out.println();
        System.out.println();

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a.charAt(j) +" ");
            }
            System.out.println();

//            A B C D
//            A B C D
//            A B C D
//            A B C D

        }
        System.out.println();
        System.out.println();


        for(int i=3;i>=0;i--){
            for(int j=0;j<4;j++){
                System.out.print(a.charAt(i) +" ");
            }
            System.out.println();
//            D D D D
//            C C C C
//            B B B B
//            A A A A


        }
        System.out.println();
        System.out.println();


    }
}
