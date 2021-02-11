public class pq11 {
    int num=100;
    public void calc(int num){ this.num=num*10;}
    public void printNum(){System.out.println(num);}
    public static void main(String[] args) {
        pq11 obj=new pq11();
        obj.calc(2);
        obj.printNum();
    }
}
