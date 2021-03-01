interface I2{
    int a=10;
    void show();
    static void methos(){
        System.out.println("static method get called");
    }
    default void prinnt(){
        System.out.println(" i2 interface print method called ");
    }
}
interface I3{
   public abstract void show();
   default void display(){
       System.out.println(" interface i3 default method get called");
   }
}
public class interface1 implements I2,I3{
    static public void main(String... args) {
        interface1 obj=new interface1();
        obj.show();
        obj.display();
        obj.prinnt();
        //call static method with the help of interface name
        I2.methos();
        //call var with inteface name
        System.out.println(I2.a);
    }

    @Override
    public void show() {
        System.out.println("void show called 1");

    }
}
