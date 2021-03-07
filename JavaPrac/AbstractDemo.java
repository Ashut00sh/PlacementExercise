abstract class Abc{
    Abc(){
        System.out.println("abstract class Abc cnstr get called");
    }
   public abstract void show();
}
public class AbstractDemo extends Abc{
    public static void main(String[] args) {
        AbstractDemo obj=new AbstractDemo();
        obj.show();
    }

    @Override
    public void show() {
        System.out.println("define show of abstract method");
        
    }
}