//calculate factorial of given number
import java.util.*;
public class FactDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int a=sc.nextInt();
        int fac=1;
        for (int i = a;i>0; i--) {
            fac=fac*i;
           // System.out.println(i);
        }
        System.out.println(fac);
    }
}
