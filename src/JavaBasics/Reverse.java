package JavaBasics;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int res=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            res=(res*10)+rem;
            n=n/10;
        }
        System.out.println(res);
        if(org==res) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
