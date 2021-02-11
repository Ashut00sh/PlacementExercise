import java.util.*;
public class repeatcharstr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to get max repeating char init");
        String str=sc.nextLine();
        int []arr=new int[127];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        int max=-1;
        String ch=" ";
        for (int i = 0; i < str.length(); i++) {
            if (max<arr[str.charAt(i)]) {
                max=arr[str.charAt(i)];
                ch=ch+str.charAt(i);
            }
        }
        System.out.println("max char count is= "+max+" char is= "+ ch);
        sc.close();    
    }
}
