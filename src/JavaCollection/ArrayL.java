package JavaCollection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(0,100);
        System.out.println(list);
        list.remove(2);
        list.stream().filter(x->x%100==0).map(x->x*100).forEach(x-> System.out.println(x));
    }
}
