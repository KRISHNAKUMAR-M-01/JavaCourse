package ExceptionHandling;

public class ArithmeticExceptionOne {
    public static void main(String[] args) {
        System.out.println("Exception Handling");
        int a = 5;
        try{
            int b=a/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Exception Handled");

    }
}
