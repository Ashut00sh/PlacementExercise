import java.util.*;
public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter second string");
        String str2=sc.nextLine();
        char[] ch1=str1.toLowerCase().toCharArray();
        char[] ch2=str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("yes it is anagram");
        }else{
            System.out.println("no not never");
        }
        sc.close();
    }
}
