import java.util.*;
class Revstr1{
    public static String reverseStr(String str){
        //terminating conditioin
        if(str == null || str.length()<=1){
            return str;
        }
        //recurssive call
        return reverseStr(str.substring(1))+str.charAt(0);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.nextLine();
        System.out.println(Revstr1.reverseStr(str));
        sc.close();
    }
}