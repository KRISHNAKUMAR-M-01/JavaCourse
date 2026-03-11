package OOPS.Encapsulation;

public class ParentAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("deer");
        a1.setCatagory("wild");
        a1.setLegs(4);
        System.out.println(a1.getName());
        System.out.println(a1.getCatagory());
        System.out.println(a1.getLegs());

        System.out.println();
        System.out.println();

        Animal a2 = new Animal();
        a2.setName("dog");
        a2.setCatagory("domestic");
        a2.setLegs(4);
        System.out.println(a2.getName());
        System.out.println(a2.getCatagory());
        System.out.println(a2.getLegs());
    }
}

