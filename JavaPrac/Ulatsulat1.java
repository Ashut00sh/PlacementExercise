import java.util.*;
public class Ulatsulat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        
        int start=0,end=str.length()-1;
        //System.out.println("start"+start);
        //System.out.println("end"+end);
        boolean isPal=true;
        while(start<end){
           // System.out.println("inside while");
            if(str.charAt(start)!=str.charAt(end)){
             //   System.out.println("inside if");
                isPal=false;
                break;
            }
            start++;
            end--;
        }
        if(isPal){
            System.out.println("given string is palindrom");
        }else{
            System.out.println("it is not a palindrom");
        }
        sc.close();
    }
    
}
