import java.math.BigInteger;
import java.util.*;
class Vowelstr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||
            str.charAt(i)=='u'){
                System.out.print("vowels present in string = "+str.charAt(i));
            }
        }
        System.out.println();
        sc.close();
    }

}