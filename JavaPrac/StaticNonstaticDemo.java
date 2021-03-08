class soo{
    public void show(){
        StaticNonstaticDemo obj=new StaticNonstaticDemo();
        obj.nonstatmethod();
        StaticNonstaticDemo.statmethod();
        System.out.println("soo class void method called");
    }
    static void disp(){
        System.out.println("soo classs disp methosd called");
    }
}
public class StaticNonstaticDemo{
    public static void main(String[] args) {
        soo obj=new soo();
        
        soo.disp();
        obj.show();
    }
    static void statmethod(){
        System.out.println("in class staticnonstaticdemo statmetod called");
    }
    void nonstatmethod(){
        System.out.println("in staticnonstaticdemo class non static method called");
    }
}