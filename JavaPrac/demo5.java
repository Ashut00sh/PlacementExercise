import java.util.*;
// class parent{
//     static void check(){
//         System.out.println("parent");
//     }
// }
public class demo5{
    static int test(String s1,String s2){
        {
            int M = s1.length();
            int N = s2.length();
            /* A loop to slide pat[] one by one */
            for (int i = 0; i <= N - M; i++) {
                int j;
                /* For current index i, check for
                pattern match */
                for (j = 0; j < M; j++)
                    if (s2.charAt(i + j)
                        != s1.charAt(j))
                        break;
                if (j == M)
                    return i;
            }
            return -1;
       // System.out.println("child");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s=sc.nextLine();
        System.out.println("Enter second string");
        String x=sc.nextLine();
        System.out.println("first occureance= "+demo5.test(s, x));
        sc.close();
        
    }
}
