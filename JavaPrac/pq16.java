public class pq16 implements Runnable{
    public static void main(String[] args) {
        pq16 t=new pq16();
        Thread th=new Thread(t);
        th.start();
        System.out.println("geek");
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("for");
    }

    @Override
    public void run() {
       System.out.println("a");
       System.out.println("b");

    }
}
