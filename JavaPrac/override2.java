class test1{
    test1 get(){
        System.out.println(" test1 get");
        return this;
    }
}
// class test2{

// }
public class override2 extends test1{
    override2 get(){
        System.out.println(" test2 get");
        return this;
    }
    public static void main(String[] args) {
        test1 t1 = new override2();
        t1.get();
    }
}
