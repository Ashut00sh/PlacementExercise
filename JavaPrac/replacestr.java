import java.util.*;
public class replacestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.replace("is", "sp1"));
        System.out.println(str.replace("was", "sp2"));
        System.out.println(str.replace("This", "sp3"));
        sc.close();
    }
}
