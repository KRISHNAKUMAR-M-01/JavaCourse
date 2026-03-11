package JavaBasics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is greater than ");
            }
        } else if (b>c) {
            System.out.println(b+" is greater than ");
        }
        else {
            System.out.println(c+" is greater than ");
        }

    }
}