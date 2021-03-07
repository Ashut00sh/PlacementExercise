import java.util.*;
public class Factorial {
    static long Fact(Long num){
        if(num==1)
        return 1;
        return num*Fact(num -1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        long n=sc.nextLong();
        sc.close();
        System.out.println("Factorial of "+n+" is = "+Fact(n));
    }
}
