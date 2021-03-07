import java.util.*;
public class StringDemo1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        sc.close();
        int l=0;
        int r=str.length()-1;
        boolean flag=true;
        for (l= 0; l < r; l++,r--) {
            if (str.charAt(l)==str.charAt(r)) {
                flag=true;
            }else
            flag=false;
        }
        if (flag) {
            System.out.println("given string is palindrom");
        }else
        System.out.println("is not a palindrom");
    }
}