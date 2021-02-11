class alpha{
    public String type="a";
    public alpha(){System.out.println("alpha ");}
}
public class pq14 extends alpha {
    public pq14(){System.out.println("in pq14");}
    void go(){
        type="b";
        System.out.println(this.type+" "+super.type);
    }
    public static void main(String[] args) {
        new pq14().go();
    }
}
