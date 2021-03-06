class thread1 extends Thread{
    // public void run(){
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println("thread void run method"+i+" ");    
    //     }
        
    // }
}
class thread2 extends Thread{
    // public void run(){
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println("thread void run method222== "+i+" ");    
    //     }
    // }
}
public class multithresdemo{
    public static void main(String[] args) {
        thread1 t=new thread1();
        thread2 t2=new thread2();
        t.start();
        t2.start();
    }
}