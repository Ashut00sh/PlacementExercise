class base{
    public void print(){
        System.out.println("in base");
    }
}
class derive extends base{
    public void print(){
        System.out.println("in derive");
    }
}
public class pq4 {
    public static void doprint(base o){
        o.print();
    }
    public static void main(String[] args) {
        base x=new base();
        base y=new derive();
        derive z=new derive();
        doprint(x);
        doprint(y);
        doprint(z);
    }
}
