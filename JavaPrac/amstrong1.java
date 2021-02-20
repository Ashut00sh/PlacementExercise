import java.util.*;
class DigitNum{
    int cntdgit(int num){
        int cnt=0;
        while (num!=0) {
            num=num/10;
            ++cnt;
        }
        System.out.println("no of digit ="+cnt);
        return num;
    }
}
public class amstrong1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int result=1,nxt=0;
        int num=sc.nextInt();
        int num1=num;
        DigitNum d=new DigitNum();
        int count=4;
        d.cntdgit(num);
       // System.out.println("count=== "+count);
        for (int i = 0; i < 4; i++) {
           // System.out.println("inside for loop");
            int rem=num%10;
           // System.out.println("remainder ="+rem);
            result=1;
            for(int j=0;count>j;j++) {
                //System.out.println("inside while loop");
                result=result*rem;
              //  System.out.println("result ="+result);
               // nxt1=nxt+result;
                //count--;
            }
            nxt=nxt+result;
          //  System.out.println("digit sum===="+nxt);
            num=num/10;
          //  System.out.println("num after divide "+num);
        }
      //  System.out.println("given number is ="+num1);
      //  System.out.println("total sum digit = "+nxt1);
        if (nxt==num1) {
            System.out.println("Given number is amstrong");
        }else{
            System.out.println("it is not amstrong number");
        }
        sc.close();
    }
}
