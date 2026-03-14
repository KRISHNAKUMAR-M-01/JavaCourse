package JavaCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class HashS {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("DragonFruit");
        System.out.println(hs);
        hs.add("Apple");
        System.out.println(hs);
        hs.stream().filter(x->x.startsWith("A")).map(x->x.toUpperCase()).forEach(x->System.out.println(x));
    }
}
