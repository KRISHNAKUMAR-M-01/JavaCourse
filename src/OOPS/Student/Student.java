package OOPS.Student;

public class Student {
    private int id;
    private String name;
    private int mark;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setMark(int mark){
        if( mark>0&&mark<100){
            this.mark=mark;
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMark() {
        return mark;
    }
}

