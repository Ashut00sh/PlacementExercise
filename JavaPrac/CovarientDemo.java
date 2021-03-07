import javax.swing.plaf.synth.SynthOptionPaneUI;

class A{
    A get(){
        return this;
    }
}
class B extends A{
    B get(){
        return this;
    }
    void show(){
        System.out.println("covarient return type");
    }
}
public class CovarientDemo {
   public static void main(String[] args) {
       B t=new B();
       A t1=new A();
       System.out.println(t1.get());
       System.out.println(t.get());
       //get method retun oblect 
       //we can call show method on get 
       new B().get().show();
   } 
}
