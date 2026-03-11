package Patterns;
public class Patterns {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //output:
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5



        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5


        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

//        5 5 5 5 5
//        4 4 4 4 4
//        3 3 3 3 3
//        2 2 2 2 2
//        1 1 1 1 1

        for(int i=5;i>=1;i--){
            for(int j=5;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

//        5 4 3 2 1
//        5 4 3 2 1
//        5 4 3 2 1
//        5 4 3 2 1
//        5 4 3 2 1



        for(int i=1;i<=25;i++){
            System.out.print(i+" ");
            if(i%5==0){
                System.out.println();
            }
        }
        System.out.println();
//        1 2 3 4 5
//        6 7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25


        for(int i=2;i<=50;i=i+2){
            System.out.print(i+" ");
            if(i%10==0){
                System.out.println();
            }
        }
        System.out.println();

//        2 4 6 8 10
//        12 14 16 18 20
//        22 24 26 28 30
//        32 34 36 38 40
//        42 44 46 48 50


        int x=1;
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(x + " ");
                x += 2;
            }
            System.out.println();
        }
        System.out.println();

//        1 3 5 7 9
//        11 13 15 17 19
//        21 23 25 27 29
//        31 33 35 37 39
//        41 43 45 47 49


        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i*j) +" ");
            }
            System.out.println();
        }
        System.out.println();

//        1 2 3 4 5
//        2 4 6 8 10
//        3 6 9 12 15
//        4 8 12 16 20
//        5 10 15 20 25

        for(int i=1;i<=5;i++){
            for(int j=1;j<=3;j++){
                System.out.print(j +" "+ i+ " ");
            }
            System.out.println();
        }
        System.out.println();

//        1 1 2 1 3 1
//        1 2 2 2 3 2
//        1 3 2 3 3 3
//        1 4 2 4 3 4
//        1 5 2 5 3 5

        for(int i=1;i<=4;i++){
            for(int k=4;k>=i;k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println();

//           1
//          2 2
//         3 3 3
//        4 4 4 4



        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if (i==1||i==5||j==1||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
//        *****
//        *   *
//        *   *
//        *   *
//        *****

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        System.out.println();
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        System.out.println();

//        1 2 3 4
//        1 2 3
//        1 2
//        1

        int num=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print( num++ +" ");
            }
            System.out.println();
        }
        System.out.println();
//        1
//        2 3
//        4 5 6
//        7 8 9 10

        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= i+1; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
        System.out.println();

//        1
//        0 1
//        1 0 1
//        0 1 0 1

        for(int i=1;i<=5;i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
//        * * * *
//         * * * *
//          * * * *
//           * * * *
//            * * * *

        for(int i=1;i<=4;i++) {
            for(int k = 4;k >=i;k--){
                System.out.print(" ");
            }
            for (int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--) {
            for(int k = 4;k >=i;k--){
                System.out.print(" ");
            }
            for (int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//        *
//       * *
//      * * *
//     * * * *
//      * * *
//       * *
//        *

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//        * * * *
//        * * *
//        * *
//        *
//        * *
//        * * *
//        * * * *
        for(int i=1;i<=5;i++) {
            for(int k = 4;k >=i;k--){
                System.out.print(" ");
            }
            for (int j =1; j <= i; j++) {
                if(i==j||i==5||j==1||j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}



