package Generic;

class GenericInterfaceClass implements GenericInterface<Integer,String>{
    private Integer id;
    private String name;

    GenericInterfaceClass(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public Integer getKey()
    {
        return id;
    }
    public String getValue()
    {
        return name;
    }

    public static void main(String[] args) {
        GenericInterfaceClass genericInterfaceClass = new GenericInterfaceClass(1,"Krish");
        System.out.println(genericInterfaceClass.getKey()+":"+genericInterfaceClass.getValue());
    }
}
