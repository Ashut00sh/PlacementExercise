
public class pq5 {
    static pq5 t;
    static int cnt=0;

    public static void main(String[] args)throws InterruptedException {
        System.out.println("main 1");
        //pq5 t1=new pq5();
        System.out.println("main 2");
        //make t1 eligibal for garbage collecction
       // t1=null;
        System.out.println("main 3");
        //calling garbage collector
        System.gc();
        System.out.println("main 4");
        //waiting gc to complete
        Thread.sleep(1000);
        System.out.println("main 5");
        //making t eligible for garbage colectioin
        t=null;
        System.out.println("main 6");
          //calling garbage collector
          System.gc();
          System.out.println("main 7");
          //waiting gc to complete
          Thread.sleep(1000);
          System.out.println("finalise method called "+cnt+" times");
    }
    @Override
    protected void finalize(){
        System.out.println("finalize called");
        cnt++;
        t=this;
        System.out.println(10/0);
    }
}
