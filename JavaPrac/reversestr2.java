import java.util.*;
public class reversestr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String str1="";
        for (int i = str.length()-1; i>0; i--) {
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
        sc.close();
    }    
}
