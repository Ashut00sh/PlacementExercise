import java.util.*;
public class revstrusingarr{
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter string");
        String st=sc.nextLine();
        char [] arr=st.toCharArray();
        int left=0,right=st.length()-1;
        for (left = 0; left < right; left++,right--) {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        for (int i = 0; i < st.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}