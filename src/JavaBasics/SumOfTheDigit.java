package JavaBasics;

import java.util.Scanner;

public class SumOfTheDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int org=n;
        int rem=0,sum=0;
        while(n>0){
             rem=n%10;
             sum=sum+rem;
             n=n/10;
        }
        System.out.println("The sum of digit " + org + " is "+ sum);
    }
}
