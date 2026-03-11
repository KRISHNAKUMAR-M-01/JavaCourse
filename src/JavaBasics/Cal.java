package JavaBasics;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Cal {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("Enter a operator:");
            char ch=sc.next().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.println("Enter two numbers:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(ch=='+'){
                    ans=a+b;
                }
                if(ch=='-'){
                    ans=a-b;
                }
                if(ch=='*'){
                    ans=a*b;
                }
                if(ch=='/'){
                    ans=a/b;
                }
                if(ch=='%'){
                    ans=a%b;
                }
            } else if (ch=='x' || ch=='X') {
                break;

            }
            else {
                System.out.println("Invalid input");
            }
            System.out.println(ans);
        }

    }
}

