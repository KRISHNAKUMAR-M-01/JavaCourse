package OOPS.Student;

//public class StudenttDetail {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setId(001);
//        s1.setName("Krish");
//        s1.setMark(50);
//        System.out.println("ID:"+s1.getId());
//        System.out.println("Name:"+s1.getName());
//        System.out.println("Mark:"+s1.getMark());
//        Student s2 = new Student();
//        s2.setId(002);
//        s2.setName("Kanna");
//        s2.setMark(1001);
//        System.out.println("ID:"+s2.getId());
//        System.out.println("Name:"+s2.getName());
//        System.out.println("Mark:"+s2.getMark());
//    }
//}
class StudentDetail {

    // Static block
    static public void add()
    {
        int a=10;
        // Print statement
        System.out.println(
                "Static block can be printed without main method");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
