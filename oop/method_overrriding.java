class person {
    String name;
    int age;
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class teacher extends person{
    String qualification;
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }
}
public class method_overrriding{
    public static void main(String[] args) {
        //person p1 = new person();
        teacher t1 = new teacher();
        t1.name="ifty";
        t1.age=22;
        t1.qualification="AI enginieeer";
        t1.display();
    }
}