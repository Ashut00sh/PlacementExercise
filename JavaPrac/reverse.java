import java.util.*;
class reverse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string whatever you want ");
        String a=sc.nextLine();
        String rev="";
        for (int i = a.length()-1; i >= 0; i--) {
            rev=rev+a.charAt(i);
 
        }
        if (rev.equals(a)) {
            System.out.println("Given string is palindrom");
        }else
        System.out.println("given string is not palindrom");
      System.out.print("reverse string is = ");
      System.out.println(rev);
      sc.close();
    }
    
}