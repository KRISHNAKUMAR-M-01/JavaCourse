package Patterns;
public class Pattern_day1 {
    public static void main(String[] args) {
        String s="SUBMIT";
        for(int i=0;i<5;i++){
            for(int j=0;j<=s.length()-1;j++){
                System.out.print(s.charAt(j)+" ");

            }
            System.out.println();
        }
        System.out.println();

//        S U B M I T
//        S U B M I T
//        S U B M I T
//        S U B M I T
//        S U B M I T

        for(int i=0;i<5;i++){
            for(int j=s.length()-1;j>=0;j-- ){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();

//        T I M B U S
//        T I M B U S
//        T I M B U S
//        T I M B U S
//        T I M B U S


        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();

//        S
//        S U
//        S U B
//        S U B M
//        S U B M I
//        S U B M I T

        for(int i=s.length()-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
//
//        S U B M I T
//        S U B M I
//        S U B M
//        S U B
//        S U
//        S

        for (int i=s.length()-1;i>=0;i--){
            for(int j=s.length()-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
//               SUBMIT
//                SUBMI
//                 SUBM
//                  SUB
//                   SU
//                    S

        for (int i=s.length()-1;i>=0;i--){
            for(int j=s.length()-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }

//        S U B M I T
//         S U B M I
//          S U B M
//           S U B
//            S U
//             S

        for(int i=0;i<=s.length()-1;i++){
            for(int k=s.length()-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
//
//                     S
//                    SU
//                   SUB
//                  SUBM
//                 SUBMI
//                SUBMIT

        for(int i=0;i<=s.length()-1;i++){
            for(int k=s.length()-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();

//             S
//            S U
//           S U B
//          S U B M
//         S U B M I
//        S U B M I T

        int n=5;
        int sq=0;
        for(int i=1;i<=n;i++){
            sq=i*i;
            System.out.print(sq+" ");
        }
        System.out.println();
        System.out.println();

//        1 4 9 16 25.........



        for(int i=1;i<=n;i++){
            sq=i*i*i;
            System.out.print(sq+" ");
        }
        System.out.println();
        System.out.println();

//        1 8 27 64 125......

        int n1=50;
        for(int i=1;i<=n1;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();


//        1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49

        for(int i=2;i<=n1;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

//        2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
        for(int i=1;i<=n1;i+=3){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();


//        1 4 7 10 13 16 19 22 25 28 31 34 37 40 43 46 49

        int num=5;
        int n2=5;

        for(int i=0;i<=n2;i++){
            num=num*2;
            System.out.print(num+" ");

        }
        System.out.println();
        System.out.println();

//        10 20 40 80 160 320

        int a=0;
        int b=1;
        System.out.print(a+","+b+",");
        for(int i=1;i<=5;i++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println();

//        0,1,1,2,3,5,8,


        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

        for(int i=0;i<5;i++){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//     * * * * *
//     * * * * *
//     * * * * *
//     * * * * *

        String abcd="ABCD";
        for(int i=0;i<abcd.length();i++){
            for(int j=abcd.length()-1;j>=i;j--){
                System.out.print(abcd.charAt(j)+" ");
            }
            System.out.println();
        }
//        D C B A
//        D C B
//        D C
//        D
        for(int i=abcd.length();i>=0;i--){
            for(int j=abcd.length()-1;j>=i;j--){
                System.out.print(abcd.charAt(j)+" ");
            }
            System.out.println();

        }

        System.out.println();
//        D
//        D C
//        D C B
//        D C B A

        for(int i=abcd.length();i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(abcd.charAt(j)+" ");
            }
            System.out.println();
        }

//        A B C D
//        A B C
//        A B
//        A









    }

}
