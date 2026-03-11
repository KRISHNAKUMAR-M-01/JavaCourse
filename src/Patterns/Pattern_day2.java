package Patterns;
public class Pattern_day2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=3;j++){
                System.out.print(i+" "+j+" ");
            }
            System.out.println();
//            1 1 1 2 1 3
//            2 1 2 2 2 3
//            3 1 3 2 3 3
//            4 1 4 2 4 3
//            5 1 5 2 5 3
        }
        System.out.println();
        System.out.println();

        for (int i=1;i<=5;i++){
            for (int j=1;j<=3;j++){
                System.out.print(j+" "+i+" ");
            }
            System.out.println();

//            1 1 2 1 3 1
//            1 2 2 2 3 2
//            1 3 2 3 3 3
//            1 4 2 4 3 4
//            1 5 2 5 3 5
        }
        System.out.println();
        System.out.println();

        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();

//            1 2 3 4 5
//            2 4 6 8 10
//            3 6 9 12 15
//            4 8 12 16 20
//            5 10 15 20 25
        }
        System.out.println();
        System.out.println();

        int x=2;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(x+" ");
                x+=2;

            }
            System.out.println();

//            1 2 3 4 5
//            2 4 6 8 10
//            3 6 9 12 15
//            4 8 12 16 20
//            5 10 15 20 25
        }
        System.out.println();
        System.out.println();

        x=1;
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(x + " ");
                x += 2;

            }
            System.out.println();

//            1 3 5 7 9
//            11 13 15 17 19
//            21 23 25 27 29
//            31 33 35 37 39
//            41 43 45 47 49
        }
        System.out.println();
        System.out.println();

        x=1;
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(x + " ");
                x += 1;

            }
            System.out.println();

//            1 2 3 4 5
//            6 7 8 9 10
//            11 12 13 14 15
//            16 17 18 19 20
//            21 22 23 24 25
        }
        System.out.println();
        System.out.println();

        int n=5;
        for(int i=1;i<=5;i++){
            x=i;
            for(int j=1;j<=5;j++) {
                System.out.print(x+" ");
                x+=n;
            }
            System.out.println();

//            1 6 11 16 21
//            2 7 12 17 22
//            3 8 13 18 23
//            4 9 14 19 24
//            5 10 15 20 25
        }
        System.out.println();
        System.out.println();

        n=9;
        for(int i=1;i<=5;i++){
            x=i;
            for (int j = 1; j <= 5; j++) {
                System.out.print(x+" ");
                x+=n;
            }
            System.out.println();

//            1 10 19 28 37
//            2 11 20 29 38
//            3 12 21 30 39
//            4 13 22 31 40
//            5 14 23 32 41
        }
        System.out.println();
        System.out.println();


        n=5;
        for(int i=5;i>0;i--){
            x=i;
            for(int j=1;j<5;j++){
                System.out.print(x+" ");
                x+=n;
            }
            System.out.println();

//            5 10 15 20
//            4 9 14 19
//            3 8 13 18
//            2 7 12 17
//            1 6 11 16
        }
        System.out.println();
        System.out.println();

        n=1;
        for(int i=1;i<=5;i++) {
            x = i;
            for (int j = 1; j < 5; j++) {
                System.out.print(x + " ");
                x += n;
            }
            System.out.println();

//            1 2 3 4
//            2 3 4 5
//            3 4 5 6
//            4 5 6 7
//            5 6 7 8
        }
        System.out.println();
        System.out.println();

        n=2;
        for(int i=1;i<=10;i+=2){
            x=i;
            for(int j=1;j<=5;j++){
                System.out.print(x+" ");
                x+=n;
            }
            System.out.println();

//            1 3 5 7 9
//            3 5 7 9 11
//            5 7 9 11 13
//            7 9 11 13 15
//            9 11 13 15 17
        }
        System.out.println();
        System.out.println();

        int y;
        for(int i=1;i<=5;i++){
            for (int j = 1; j <= 3; j++) {
                if(i%2==1){
                    x=0;
                    y=1;
                    System.out.print(x+" "+y+" ");
                }
                else {
                    x=1;
                    y=0;
                    System.out.print(x+" "+y+" ");
                }
            }
            System.out.println();

//            0 1 0 1 0 1
//            1 0 1 0 1 0
//            0 1 0 1 0 1
//            1 0 1 0 1 0
//            0 1 0 1 0 1

        }
        System.out.println();
        System.out.println();

        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 3; j++) {
                if (i % 2 != 1) {
                    x = 0;
                    y = 1;
                    System.out.print(x + " " + y + " ");
                } else {
                    x = 1;
                    y = 0;
                    System.out.print(x + " " + y + " ");
                }
            }
            System.out.println();
        }




    }
}
