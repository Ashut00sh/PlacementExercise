import java.util.*;
public class revstr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        sc.close();
        char []ch=str.toCharArray();
        int l=0,r=ch.length-1;
        for (l=0; l < r; l++,r--){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            //System.out.print(ch[i]);
        }
        //print the string
        for (int i = 0; i < str.length(); i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
      
    }
}
