

//compile time polymorphism-->method overloading.
//run time polymorphism/ dynamic binding-->method overridding.
class person { // run time polymorphism.
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
        System.out.println(qualification);////method overloading is only in a singel unit...
    }
}
public class polymorphism {
     public static void main(String[] args) {
        //person p1 = new person();
        teacher t1 = new teacher();
        t1.name="ifty";
        t1.age=22;
        t1.qualification="AI enginieeer";
        t1.display();
    }
}
