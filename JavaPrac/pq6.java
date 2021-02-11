public class pq6 {
    public static void main(String[] args)throws InterruptedException {
      //  String str=new String("gfg");
       // str=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("end of main ");
    }
    @Override
    protected void finalize(){
        System.out.println("finalise method called");
    }
}
