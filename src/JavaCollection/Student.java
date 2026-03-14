package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student s=new Student("krish",21);
        Student s1=new Student("jeba",22);
        Student s2=new Student("kishore",35);
        Student s3=new Student("marish",33);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.stream().filter(x->x.age<=25).map(x->x.name).forEach(x-> System.out.println(x));
        Collections.sort(list);
        list.stream().forEach(x-> System.out.println(x));
    }

    @Override
    public int compareTo(Student o) {
        return o.age - age;
    }
}
