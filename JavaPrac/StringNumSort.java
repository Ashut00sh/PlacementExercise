import java.util.*;
public class StringNumSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String ");
        //string input
        String str=sc.nextLine();
        //take numbers into string array without ,
        String []number=str.split(",");
        Integer[]intval=new Integer[number.length];
        //insert string numbers to Integer arrray
        for (int i = 0; i < intval.length; i++) {
            intval[i]=Integer.parseInt(number[i]);
        }
        //sort array
        Arrays.sort(intval);
        //print it in reverse order 
        for (int i = intval.length-1;i>=0; i--) {
            System.out.print(intval[i]+",");
        }
        sc.close();
    }
}
