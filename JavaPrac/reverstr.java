import java.util.*;
public class reverstr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.nextLine();
        for (int i = str.length()-1; i > 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(str);
        sc.close();
    }
}
