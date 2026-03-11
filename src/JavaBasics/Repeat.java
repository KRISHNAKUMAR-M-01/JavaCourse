package JavaBasics;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=0;
        while (n>0){
            int rem = n%10;
            if(rem==5){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
