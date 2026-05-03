abstract class mobileuser{
    abstract void sendmessegge();
}
class rahim extends mobileuser{
    void sendmessegge(){
        System.out.println("hi this is ifty");
    }
}
public class abstruction {
    public static void main(String[] args){
        mobileuser ms;
        ms=new rahim();
        ms.sendmessegge();
    }
}
