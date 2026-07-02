package Generic;

public class GenericClass<T> {
    private T value;

    GenericClass(T value){
        this.value=value;
    }
    T getValue(){
        return value;
    }
    public static void main(String[] args) {
        GenericClass<String> stringGenericClass = new GenericClass<>("hello");
        GenericClass<Integer> integerGenericClass=new GenericClass<>(123);

        System.out.println(stringGenericClass.getValue());
        System.out.println(integerGenericClass.getValue());
    }

}
