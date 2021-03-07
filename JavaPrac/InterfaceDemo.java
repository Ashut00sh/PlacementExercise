interface Acd{
    default void show(){
        System.out.println("default show method of interface acd called");
    }
    static void disp(){
        System.out.println("static disp method get called");
    }
}
public class InterfaceDemo implements Acd{
    public static void main(String[] args) {
        InterfaceDemo obj=new InterfaceDemo();
        //obj of implemented class can call default method
        obj.show();
        //static method get called with interface name
        Acd.disp();
    }
}
