
public class pq2 {
     int num;
    static String mystr;
    //constructor
    pq2(){
        num=100;
        mystr="constructor";
    }
    //first static block
    static{
        System.out.println("into first static block ");
       //num=68;
        mystr="first static block";
    }
    //second static block
    static{
        System.out.println("into second static block ");
      //  num=68;
        mystr="second static block";
    }
    public static void main(String[] args) {
        pq2 a=new pq2();
       // System.out.println("vlaue of sum ="+pq2.num);
      //  System.out.println("value of mystr="+pq2.mystr);
        System.out.println("by obj"+a.num);
    }
}
