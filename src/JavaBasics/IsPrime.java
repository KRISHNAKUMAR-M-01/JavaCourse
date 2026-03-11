package JavaBasics;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean IsPrime=true;
        if(n<2 || n==0){
            IsPrime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    IsPrime=false;
                }

            }
        }
        if(IsPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
