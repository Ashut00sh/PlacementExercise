import java.util.*;
public class Fibonacci {
    static int a=0,b=1,c=0;
    int x;
    
    static void fibseries(int cnt){
        if (cnt>0) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            fibseries(cnt-1); 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=0;
        System.out.println("print z "+z);
        System.out.println("print  x" +x);
        System.out.println("Enter number upto which series get print");
        int cnt=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibseries(cnt-2);
        sc.close();
    }
}
