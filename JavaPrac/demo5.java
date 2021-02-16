class parent{
    static void check(){
        System.out.println("parent");
    }
}
public class demo5 extends parent{
    static void test(){
        System.out.println("child");
    }
    public static void main(String[] args) {
        parent p=new child();
        p.test();
    }
}
