package JavaBasics;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b =1;
        int result=0;
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            result=a+b;
            a=b;
            b=result;
        }
//        System.out.println(result);
    }
}
