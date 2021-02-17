import java.util.*;
public class maxcharoccur {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string");
        String st = sc.nextLine();
        //to remove white space in string
        //if you give multiple white space o/p wan't get print
        String str=st.replaceAll("\\s","");
        System.out.println(" after remove white space======= "+str);
       // String str="max repeating char";
        int arr[]=new int[127];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
            //97th index
            //a[97]=0+1; where str.charAt(i)='a' and ascii of a=97;
            //in array of 127 index 97 get updated
        }
        int max=-1;
        char c=' ';
        for (int i = 0; i < str.length(); i++) {
            if (max<arr[str.charAt(i)]) {
                // -1 < arr[str.chatAt('a')] -1< arr[97] -1 < 1
                max=arr[str.charAt(i)];
                // max=1;
                c=str.charAt(i);
                //c=a
            }
        }
        System.out.println("max occuring char in str is= "+c);
        sc.close();
    }
}
