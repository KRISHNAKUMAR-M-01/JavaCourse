package Array;
public class ReturnInt {
    static void display(){
        System.out.println("Hello Java");
    }

    static int add(int a, int b){
        return a + b;
    }
    static double average(int a, int b){
        return (a + b) / 2.0;
    }
    static boolean isEven(int n){
        return n % 2 == 0;
    }
    static String greet(String name){
        return "Hello " + name;
    }


    public static void main(String[] args) {
        display();
        int result = add(10,20);
        System.out.println("Sum: " + result);

        double average = average(10,20);
        System.out.println("Average: " + average);

        if(isEven(10)){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        String message = greet("Krishnakumar");
        System.out.println(message);


    }
}
