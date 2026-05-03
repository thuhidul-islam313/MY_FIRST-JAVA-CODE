//package oop;

public class exception_handling {
     
    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            int p=x/y;
            System.out.println(p);
        }catch(Exception g){
            System.out.println(g);
        }
        finally{
            System.out.println("you must print the all line after the error point");
        }
    }
}
