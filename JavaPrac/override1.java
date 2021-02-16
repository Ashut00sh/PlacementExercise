class foosu{
    public int sum(int a,int b){
        return a+b;

    }
}
class hoo extends foosu{
    public Integer sum(int a,int b){  //Interger is wrapper type and int is primitive type 
        return a+b;
    }
}
public class override1{
    public static void main(String[] args) {
        foosu f=new hoo();
        f.sum(5, 10);
    }
}