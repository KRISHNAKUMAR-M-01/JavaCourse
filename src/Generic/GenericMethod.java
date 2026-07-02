package Generic;

class Demo {
    static  <T> void printArray(T[] arr){
        for(T val:arr){
            System.out.print(val+ " ");
        }
        System.out.println();
    }
}
public class GenericMethod{
    public static void main(String[] args) {
        Integer[] a = {8, 9, 6, 5};
        String[] strings = {"bjnj", "bhbh", "bujbnju" };
        Demo.printArray(a);
        Demo.printArray(strings);
    }
}
