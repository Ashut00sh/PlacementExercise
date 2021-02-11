class writer{
    public static void write(){
        System.out.println("writing...");
    }
}
class author extends writer{
    public static void write(){
        System.out.println("writing book....");
    }
}
public class pq15 extends author{
    public static void write(){
        System.out.println("writing....code");
    }
    public static void main(String[] args) {
       // author obj=new pq15();
       // obj.write();
    }
}
