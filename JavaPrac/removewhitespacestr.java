import java.util.*;
public class removewhitespacestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String st=sc.nextLine();
        //Empty string 
        String st1=" ";
        for (int j = 0; j < st.length(); j++) {
            if (st.charAt(j)!=' ') {
                st1=st1+st.charAt(j);
            }    
        }
        System.out.println(" "+st1);
    }
}
