import java.util.*;
public class Dusariprat{
    public static void main(String[] k) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter strig");
        String str=sc.nextLine();
        String result="";
        sc.close();
        for(int i=0;i<str.length();i++){

            if(!result.contains(str.charAt(i)+"")){
                result=result+str.charAt(i);
            }
        }
        System.out.println("remove duplicate == "+result);
    }
}
