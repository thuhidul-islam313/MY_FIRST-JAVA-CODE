class person {
    private String name;
    private int age;
    public void setter(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void getter(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
public class encaptest{
    public static void main(String[] args) {
        person p1 = new person();
        p1.setter("ifty",22);
        p1.getter();
    }
}